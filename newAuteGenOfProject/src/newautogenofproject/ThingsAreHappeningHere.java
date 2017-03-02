package newautogenofproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.pde.internal.core.natures.PDE;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.parse.Egx_EolParserRules.additiveExpression_return;
import org.eclipse.epsilon.emc.emf.EmfMetaModel;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.emc.uml.UmlModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;

public class ThingsAreHappeningHere {
	
	String name = "simpleFlowchart";
	IProgressMonitor progresMonitor = new NullProgressMonitor();
	IWorkspace workspace = ResourcesPlugin.getWorkspace();
	IWorkspaceRoot root = workspace.getRoot();
	IProject project = root.getProject(name);
	
	public void createPluginProject() throws CoreException {
		if (!project.exists()) {
			project.create(progresMonitor);
		}
		project.open(progresMonitor);
		IProjectDescription desc = project.getDescription();
		desc.setNatureIds(new String[] {
		      PDE.PLUGIN_NATURE});
		project.setDescription(desc, progresMonitor);
	}
	
	public void createThePalette() throws Exception {
		
		EtlModule etlModule = new EtlModule();
		EmfModel sourceModel = new EmfModel();
		
	    StringProperties sourceProperties = new StringProperties();
	    sourceProperties.put(EmfModel.PROPERTY_METAMODEL_URI,"http://www.eclipse.org/emf/2002/Ecore");
	    sourceProperties.put(EmfModel.PROPERTY_MODEL_FILE, "C:\\Git\\SACM\\SACM-UML-Profile\\newAuteGenOfProject\\files\\simpleFlowchart.ecore");
	    sourceProperties.put(EmfModel.PROPERTY_NAME, "Source");
	    sourceProperties.put(EmfModel.PROPERTY_READONLOAD, "true");
	    sourceProperties.put(EmfModel.PROPERTY_STOREONDISPOSAL, "false");
	    sourceModel.load(sourceProperties, (IRelativePathResolver) null);

		PlainXmlModel targetModel = new PlainXmlModel();
		StringProperties targetProperties = new StringProperties();
		targetProperties.put(PlainXmlModel.PROPERTY_FILE, project.getLocation() + File.separator + "palette.xml");
		targetProperties.put(PlainXmlModel.PROPERTY_NAME, "Target");
		targetProperties.put(PlainXmlModel.PROPERTY_READONLOAD, "false");
		targetProperties.put(PlainXmlModel.PROPERTY_STOREONDISPOSAL, "true");
	    targetModel.load(targetProperties);
	    
	    etlModule.getContext().getModelRepository().addModel(sourceModel);
	    etlModule.getContext().getModelRepository().addModel(targetModel);
	    File etlFile = new File("C:\\Git\\SACM\\SACM-UML-Profile\\newAuteGenOfProject\\files\\paletteGenerationM2M.etl");
	    etlModule.parse(etlFile);
	    etlModule.execute();
	    etlModule.getContext().getModelRepository().dispose();
	}
	
	public void createThePluginXml() throws Exception {
		EtlModule etlModule = new EtlModule();
		EmfModel sourceModel = new EmfModel();
		
	    StringProperties sourceProperties = new StringProperties();
	    sourceProperties.put(EmfModel.PROPERTY_METAMODEL_URI,"http://www.eclipse.org/emf/2002/Ecore");
	    sourceProperties.put(EmfModel.PROPERTY_MODEL_FILE, "C:\\Git\\SACM\\SACM-UML-Profile\\newAuteGenOfProject\\files\\simpleFlowchart.ecore");
	    sourceProperties.put(EmfModel.PROPERTY_NAME, "Source");
	    sourceProperties.put(EmfModel.PROPERTY_READONLOAD, "true");
	    sourceProperties.put(EmfModel.PROPERTY_STOREONDISPOSAL, "false");
	    sourceModel.load(sourceProperties, (IRelativePathResolver) null);

		PlainXmlModel targetModel = new PlainXmlModel();
		StringProperties targetProperties = new StringProperties();
		targetProperties.put(PlainXmlModel.PROPERTY_FILE, project.getLocation() + File.separator + "plugin.xml");
		targetProperties.put(PlainXmlModel.PROPERTY_NAME, "Target");
		targetProperties.put(PlainXmlModel.PROPERTY_READONLOAD, "false");
		targetProperties.put(PlainXmlModel.PROPERTY_STOREONDISPOSAL, "true");
	    targetModel.load(targetProperties);
	    
	    etlModule.getContext().getModelRepository().addModel(sourceModel);
	    etlModule.getContext().getModelRepository().addModel(targetModel);
	    File etlFile = new File("C:\\Git\\SACM\\SACM-UML-Profile\\newAuteGenOfProject\\files\\pluginXmlGenerationM2M.etl");
	    etlModule.parse(etlFile);
	    etlModule.execute();
	    etlModule.getContext().getModelRepository().dispose();
	}
	
	public void createTheManifestFile() throws IOException {
		new File(project.getLocation() + File.separator + "META-INF").mkdir();
		BufferedWriter output = new BufferedWriter(new FileWriter(project.getLocation() + File.separator + "META-INF" + File.separator + "MANIFEST.MF", false));
		try {
			output.write("Manifest-Version: 1.0\n"
					+ "Bundle-ManifestVersion: 2\n"
					+ "Bundle-Name: simpleFlowchart\n"
					+ "Bundle-SymbolicName: autoGenedProf;singleton:=true\n"
					+ "Bundle-Version: 1.0.0.qualifier\n"
					+ "Require-Bundle: org.eclipse.papyrus.uml.diagram.common,"
					+ "org.eclipse.papyrus.uml.extensionpoints,"
					+ "org.eclipse.papyrus.uml.diagram.clazz;bundle-version=\"2.0.0\"\n");
			output.close();
		} catch(IOException ex) {
            System.out.println("Error writing to file...");
    	}
	}
	
	public void createTheProfileUmlFile() throws Exception {
		EtlModule etlModule = new EtlModule();

		// The ultimate goal: the UML profile
		EmfModel sourceModel = new EmfModel();
	    StringProperties sourceProperties = new StringProperties();
	    sourceProperties.put(EmfModel.PROPERTY_METAMODEL_URI,"http://www.eclipse.org/emf/2002/Ecore");
	    sourceProperties.put(EmfModel.PROPERTY_MODEL_FILE, "C:\\Git\\SACM\\SACM-UML-Profile\\newAuteGenOfProject\\files\\simpleFlowchart.ecore");
	    sourceProperties.put(EmfModel.PROPERTY_NAME, "Source");
	    sourceProperties.put(EmfModel.PROPERTY_READONLOAD, "true");
	    sourceProperties.put(EmfModel.PROPERTY_STOREONDISPOSAL, "false");
	    sourceModel.load(sourceProperties, (IRelativePathResolver) null);
		
	    // The emfatic (ecore) source
		UmlModel targetModel = new UmlModel();
		StringProperties targetProperties = new StringProperties();
		targetProperties.put(UmlModel.PROPERTY_METAMODEL_URI,"http://www.eclipse.org/uml2/5.0.0/UML");
		targetProperties.put(UmlModel.PROPERTY_MODEL_FILE, project.getLocation() + File.separator + "model.profile.uml");
		targetProperties.put(UmlModel.PROPERTY_NAME, "Profile");
		targetProperties.put(UmlModel.PROPERTY_READONLOAD, "false");
		targetProperties.put(UmlModel.PROPERTY_STOREONDISPOSAL, "true");
		targetModel.load(targetProperties, (IRelativePathResolver) null);
		
		// The UML Metamodel
		UmlModel umlMetaModel = new UmlModel();
		StringProperties umlMetaModelProperties = new StringProperties();
		umlMetaModelProperties.put(UmlModel.PROPERTY_METAMODEL_URI, "http://www.eclipse.org/emf/2002/Ecore");
		//umlMetaModelProperties.put(UmlModel.PROPERTY_REUSE_UNMODIFIED_FILE_BASED_METAMODELS, true);
		umlMetaModelProperties.put(UmlModel.PROPERTY_MODEL_FILE, "pathmap://UML_METAMODELS/UML.metamodel.uml");
		umlMetaModelProperties.put(UmlModel.PROPERTY_NAME, "UMLM2");
		umlMetaModelProperties.put(UmlModel.PROPERTY_READONLOAD, "true");
		umlMetaModelProperties.put(UmlModel.PROPERTY_STOREONDISPOSAL, "false");
		umlMetaModel.load(umlMetaModelProperties, (IRelativePathResolver) null);
		
		// The UML Ecore Metamodel
		EmfMetaModel umlEcoreMetaModel = new EmfMetaModel();
		StringProperties umlEcoreMetaModelProperties = new StringProperties();
		umlEcoreMetaModelProperties.put(EmfMetaModel.PROPERTY_METAMODEL_URI, "http://www.eclipse.org/uml2/5.0.0/UML");
		umlEcoreMetaModelProperties.put(EmfMetaModel.PROPERTY_NAME, "UMLEcore");
		umlEcoreMetaModelProperties.put(EmfMetaModel.PROPERTY_READONLOAD, "true");
		umlEcoreMetaModelProperties.put(EmfMetaModel.PROPERTY_STOREONDISPOSAL, "false");
		umlEcoreMetaModel.load(umlEcoreMetaModelProperties, (IRelativePathResolver) null);
		
		// The ECore Metamodel
		EmfMetaModel ECoreMetaModel = new EmfMetaModel();
		StringProperties ECoreMetaModelProperties = new StringProperties();
		ECoreMetaModelProperties.put(EmfMetaModel.PROPERTY_METAMODEL_URI, "http://www.eclipse.org/emf/2002/Ecore");
		ECoreMetaModelProperties.put(EmfMetaModel.PROPERTY_NAME, "EcoreM2");
		ECoreMetaModelProperties.put(EmfMetaModel.PROPERTY_READONLOAD, "true");
		ECoreMetaModelProperties.put(EmfMetaModel.PROPERTY_STOREONDISPOSAL, "false");
		ECoreMetaModel.load(ECoreMetaModelProperties, (IRelativePathResolver) null);
		
		
		// The Ecore Primitive Types
		UmlModel ecorePrimitiveTypesModel = new UmlModel();
		StringProperties ecorePrimitiveTypesModelProperties = new StringProperties();
		ecorePrimitiveTypesModelProperties.put(UmlModel.PROPERTY_MODEL_FILE, "pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml");
		ecorePrimitiveTypesModelProperties.put(UmlModel.PROPERTY_NAME, "ECorePrimitiveTypes");
		ecorePrimitiveTypesModelProperties.put(UmlModel.PROPERTY_READONLOAD, "true");
		ecorePrimitiveTypesModelProperties.put(UmlModel.PROPERTY_STOREONDISPOSAL, "false");
		ecorePrimitiveTypesModel.load(ecorePrimitiveTypesModelProperties, (IRelativePathResolver) null);
		
		
		etlModule.getContext().getModelRepository().addModel(sourceModel);
	    etlModule.getContext().getModelRepository().addModel(targetModel);
	    etlModule.getContext().getModelRepository().addModel(umlMetaModel);
	    etlModule.getContext().getModelRepository().addModel(umlEcoreMetaModel);
	    etlModule.getContext().getModelRepository().addModel(ECoreMetaModel);
	    etlModule.getContext().getModelRepository().addModel(ecorePrimitiveTypesModel);
	    File etlFile = new File("C:\\Git\\SACM\\SACM-UML-Profile\\newAuteGenOfProject\\files\\emf2umlprofile2Annotations.etl");
	    etlModule.parse(etlFile);
	    etlModule.execute();
	    etlModule.getContext().getModelRepository().getModelByName("Profile").dispose();
	}
}