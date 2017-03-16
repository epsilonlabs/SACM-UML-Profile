package gsn.evl;

import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfMetaModel;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

public class RunEvl {
	/** Current workspace*/
//	protected IWorkspace workspace = ResourcesPlugin.getWorkspace();

	/** Workspace root*/
//	protected IWorkspaceRoot root = workspace.getRoot();

	/** Current project*/
	protected IProject project;

	/** Progress monitor*/
	protected IProgressMonitor progressMonitor = new NullProgressMonitor();

	/** Evl handler*/
	protected EvlModule evlModule;
	
	/** GSN metamodel*/
	protected EmfMetaModel emfMetaModel;
	
	/** GSN model*/
	protected EmfModel emfModel;
	
	
	
	/**
	 * Class constructor
	 */
	public RunEvl(){
		//init EVL module
		evlModule = new EvlModule();
	}
	
	
	public void run(){
		//load GSN metamodel
		try {
			String metaModelStr	= "../../gsnModels/gsn.ecore";
//			String metaModelStr	= "../../ooExample/OO.ecore";

			String metaModelURI = "http://www.goalstructuringnotation.info/1.0";
//			String metaModelURI = "http://www.myOOModel.org";
			
			String model		= "src/gsnModels/gsn.model";
//			String model		= "/Users/sgerasimou/Documents/Programming/workspaceEpsilonNeon/gsn.model.validation/src/ooExample/myUntitled.model";
//			String model		= "src/ooExample/OOInstance.model";
			
			String evlScript 	= "src/gsnModels/gsn.evl";			
//			String evlScript 	= "src/ooExample/ValidateOO.evl";			
			
			String modelName	= "GSN";
//			String modelName	= "OO";
			
			//register MM
			URI uri = URI.createURI(URIResolver.getFileURI(metaModelStr).toString());
			EmfUtil.register(uri, EPackage.Registry.INSTANCE);
			
			//create EMF (GSN) model instance
			emfModel = createAndLoadAnEmfModel(metaModelURI, model, modelName, "true", "false");
						
			//add model to repository
			evlModule.getContext().getModelRepository().addModel(emfModel);
	
			//parse evl script
			evlModule.parse(new File(evlScript));
			checkParsing();

			//execute evl script
			evlModule.execute();
			checkEvaluation();
			
			//dispore model
			evlModule.getContext().getModelRepository().dispose();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * EmfMetamodel instance creator
	 * @param metamodelUri
	 * @param modelName
	 * @param readOnLoad
	 * @param storeOnDisposal
	 * @return
	 * @throws EolModelLoadingException
	 */
	@Deprecated
	private EmfMetaModel createAndLoadAnEmfMetaModel(String metamodelUri, String modelName, String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		EmfMetaModel metamodel = new EmfMetaModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfMetaModel.PROPERTY_METAMODEL_URI, metamodelUri);
		properties.put(EmfMetaModel.PROPERTY_NAME, modelName);
		properties.put(EmfMetaModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfMetaModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		metamodel. load(properties, (IRelativePathResolver) null);
		return metamodel;
	}
	
	
	/**
	 * Create and load an EMF model
	 * @param metamodelURI
	 * @param modelFile
	 * @param modelName
	 * @param readOnLoad
	 * @param storeOnDisposal
	 * @return
	 * @throws EolModelLoadingException
	 */
	private EmfModel createAndLoadAnEmfModel(String metamodelURI, String modelFile, String modelName, String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		EmfModel theModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodelURI);		
		properties.put(EmfModel.PROPERTY_MODEL_FILE, modelFile);
		properties.put(EmfModel.PROPERTY_NAME, modelName);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		theModel.load(properties); //(properties, (IRelativePathResolver) null);
		return theModel;
	}	
	
	
	/**
	 * Print problem occurred from parsing and EVL script
	 */
	private void checkParsing(){
		List<ParseProblem> problems = evlModule.getParseProblems();
		if (problems.size()==0){
			System.out.println("Evl script " + evlModule.getSourceFile().getName() +" parsed correctly.\n");
		}
		else {
			System.out.println("Evl script " + evlModule.getSourceFile().getName() +" contains errors.");
			for (ParseProblem problem : problems){
				System.out.println(problem);
			}
		}	
	}
	
	
	/**
	 * Check results from EVL script execution
	 */
	private void checkEvaluation(){
		List<UnsatisfiedConstraint> unsatConstraints = evlModule.getContext().getUnsatisfiedConstraints();
		
		if (unsatConstraints.size()==0){
			System.out.println("Model" + emfModel.getName() +" validated correctly.\n");
		}
		else {
			System.out.println("Model " + emfModel.getName() +" contains validation errors.");
			for (UnsatisfiedConstraint unsatConstraint : unsatConstraints){
				System.out.println(unsatConstraint.getMessage());
			}
		}	
	}	

}
