package newautogenofproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplate;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.internal.EglModule;
import org.eclipse.epsilon.emc.emf.EmfMetaModel;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.emc.uml.UmlModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.pde.internal.core.natures.PDE;

import newautogenofproject.popup.Activator;

@SuppressWarnings("restriction")
public class ThingsAreHappeningHere {

	String name;
	IProgressMonitor progressMonitor = new NullProgressMonitor();
	IWorkspace workspace = ResourcesPlugin.getWorkspace();
	IWorkspaceRoot root = workspace.getRoot();
	IProject project;

	public ThingsAreHappeningHere(String theSelectedFilePath) {
		this.name = getNameOfEPackage(theSelectedFilePath);
		project = root.getProject(name);
		File test = new File("");
	}

	public void createPluginProject(String theSelectedFile) throws CoreException {
		if (!project.exists()) {
			project.create(progressMonitor);
		}
		project.open(progressMonitor);
		IProjectDescription desc = project.getDescription();
		desc.setNatureIds(new String[] { PDE.PLUGIN_NATURE });
		project.setDescription(desc, progressMonitor);
	}

	public void createThePaletteConfiguration(String theSelectedFilePath) throws Exception {

		// This is to generate the deprecated palette.xml. Please don't delete.
		/*
		 * EtlModule etlModule = new EtlModule(); EmfModel sourceModel = new
		 * EmfModel();
		 * 
		 * StringProperties sourceProperties = new StringProperties();
		 * sourceProperties.put(EmfModel.PROPERTY_METAMODEL_URI,
		 * "http://www.eclipse.org/emf/2002/Ecore");
		 * sourceProperties.put(EmfModel.PROPERTY_MODEL_FILE,
		 * theSelectedFilePath); sourceProperties.put(EmfModel.PROPERTY_NAME,
		 * "Source"); sourceProperties.put(EmfModel.PROPERTY_READONLOAD,
		 * "true"); sourceProperties.put(EmfModel.PROPERTY_STOREONDISPOSAL,
		 * "false"); sourceModel.load(sourceProperties, (IRelativePathResolver)
		 * null);
		 * 
		 * PlainXmlModel targetModel = new PlainXmlModel(); StringProperties
		 * targetProperties = new StringProperties();
		 * targetProperties.put(PlainXmlModel.PROPERTY_FILE,
		 * project.getLocation() + File.separator + "palette.xml");
		 * targetProperties.put(PlainXmlModel.PROPERTY_NAME, "Target");
		 * targetProperties.put(PlainXmlModel.PROPERTY_READONLOAD, "false");
		 * targetProperties.put(PlainXmlModel.PROPERTY_STOREONDISPOSAL, "true");
		 * targetModel.load(targetProperties);
		 * 
		 * etlModule.getContext().getModelRepository().addModel(sourceModel);
		 * etlModule.getContext().getModelRepository().addModel(targetModel);
		 * 
		 * java.net.URI etlFile =
		 * Activator.getDefault().getBundle().getResource(
		 * "files/paletteGenerationM2M.etl").toURI(); etlModule.parse(etlFile);
		 * etlModule.execute();
		 * etlModule.getContext().getModelRepository().dispose();
		 */

		EtlModule etlModule = new EtlModule();
		EmfModel sourceModel = createAndLoadAnEmfModel("http://www.eclipse.org/emf/2002/Ecore", theSelectedFilePath, "Source", "true", "false");
		
		EmfModel targetModel = createAndLoadAnEmfModel("http://www.eclipse.org/papyrus/diagram/paletteconfiguration/0.7", project.getLocation().toOSString() + File.separator
				+ "resources" + File.separator + name + ".paletteconfiguration", "Target", "false", "true");
				
		ArrayList<IModel> allTheModels = new ArrayList<IModel>();
		allTheModels.addAll(Arrays.asList(sourceModel, targetModel));
		doTheETLTransformation(etlModule, allTheModels, "files/paletteConfigurationGenerationM2M.etl");
	}

	public void createTheDiagramConfiguration(String theSelectedFilePath) throws Exception {

		EtlModule etlModule = new EtlModule();
		EmfModel sourceModel = createAndLoadAnEmfModel("http://www.eclipse.org/emf/2002/Ecore", theSelectedFilePath, "Source", "true", "false");

		EmfModel targetModel = createAndLoadAnEmfModel("http://www.eclipse.org/papyrus/infra/viewpoints/configuration", project.getLocation().toOSString() + File.separator
				+ "resources" + File.separator + name + "diagrams.configuration", "Target", "false", "true");

		EmfMetaModel umlEcoreMetaModel = createAndLoadAnEmfMetaModel("http://www.eclipse.org/uml2/5.0.0/UML", "UMLEcore", "true", "false");

		ArrayList<IModel> allTheModels = new ArrayList<IModel>();
		allTheModels.addAll(Arrays.asList(sourceModel, targetModel, umlEcoreMetaModel));

		doTheETLTransformation(etlModule, allTheModels, "files/diagramsConfigurationGenerationM2M.etl");

	}

	public void createTheCSSFile(String theSelectedFilePath) throws Exception {
		EmfModel sourceModel = createAndLoadAnEmfModel("http://www.eclipse.org/emf/2002/Ecore", theSelectedFilePath, "Source", "true", "false");

		EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		IEolExecutableModule eglModule = new EglTemplateFactoryModuleAdapter(factory);

		eglModule.getContext().getModelRepository().addModel(sourceModel);

		java.net.URI EglFile = Activator.getDefault().getBundle().getResource("files/cssFileGeneration.egl").toURI();
		// eglModule.parse(EglFile);

		EglFileGeneratingTemplate template = (EglFileGeneratingTemplate) factory.load(EglFile);
		template.process();
		File target = new File(project.getLocation().toOSString() + File.separator + "resources" + File.separator + name
				+ "diagram.css");
		target.createNewFile();
		template.generate(target.toURI().toString());
	}

	public void createTheTypesConfigurations(String theSelectedFilePath) throws Exception {
		EtlModule etlModule = new EtlModule();
		EmfModel sourceModel = createAndLoadAnEmfModel("http://www.eclipse.org/emf/2002/Ecore", theSelectedFilePath, "Source", "true", "false");

		EmfModel targetModel = createAndLoadAnEmfModel("http://www.eclipse.org/papyrus/uml/types/applystereotypeadvice/1.1, http://www.eclipse.org/papyrus/infra/elementtypesconfigurations/1.1, http://www.eclipse.org/papyrus/uml/types/stereotypematcher/1.1", project.getLocation().toOSString() + File.separator
				+ "resources" + File.separator + "modelelement.typesconfigurations", "Target", "false", "true");

		ArrayList<IModel> allTheModels = new ArrayList<IModel>();
		allTheModels.addAll(Arrays.asList(sourceModel, targetModel));

		doTheETLTransformation(etlModule, allTheModels, "files/typesConfigurationsM2M.etl");
	}

	public void createTheElementTypeConfigurations(String theSelectedFilePath) throws Exception {
		EtlModule etlModule = new EtlModule();
		EmfModel sourceModel = createAndLoadAnEmfModel("http://www.eclipse.org/emf/2002/Ecore", theSelectedFilePath, "Source", "true", "false");

		EmfModel targetModel = createAndLoadAnEmfModel("http://www.eclipse.org/papyrus/infra/elementtypesconfigurations/1.1", project.getLocation().toOSString() + File.separator
				+ "resources" + File.separator + "diagramshapes.elementtypesconfigurations", "Target", "false", "true");

		ArrayList<IModel> allTheModels = new ArrayList<IModel>();
		allTheModels.addAll(Arrays.asList(sourceModel, targetModel));

		doTheETLTransformation(etlModule, allTheModels, "files/elementTypesConfigurationsM2M.etl");
	}

	public void createThePluginXml(String theSelectedFilePath) throws Exception {
		EtlModule etlModule = new EtlModule();
		EmfModel sourceModel = createAndLoadAnEmfModel("http://www.eclipse.org/emf/2002/Ecore", theSelectedFilePath, "Source", "true", "false");

		PlainXmlModel targetModel = new PlainXmlModel();
		StringProperties targetProperties = new StringProperties();
		targetProperties.put(PlainXmlModel.PROPERTY_FILE,
				project.getLocation().toOSString() + File.separator + "plugin.xml");
		targetProperties.put(PlainXmlModel.PROPERTY_NAME, "Target");
		targetProperties.put(PlainXmlModel.PROPERTY_READONLOAD, "false");
		targetProperties.put(PlainXmlModel.PROPERTY_STOREONDISPOSAL, "true");
		targetModel.load(targetProperties);

		ArrayList<IModel> allTheModels = new ArrayList<IModel>();
		allTheModels.addAll(Arrays.asList(sourceModel, targetModel));
		doTheETLTransformation(etlModule, allTheModels, "files/pluginXmlGenerationM2M.etl");
	}

	public void createTheManifestFile(String theSelectedFilePath) throws IOException {
		new File(project.getLocation() + File.separator + "META-INF").mkdir();
		BufferedWriter output = new BufferedWriter(new FileWriter(
				project.getLocation().toOSString() + File.separator + "META-INF" + File.separator + "MANIFEST.MF",
				false));
		try {
			output.write("Manifest-Version: 1.0\n" + "Bundle-ManifestVersion: 2\n" + "Bundle-Name: " + name + "\n"
					+ "Bundle-SymbolicName: " + name + ";singleton:=true\n" + "Bundle-Version: 1.0.0.qualifier\n"
					+ "Require-Bundle: org.eclipse.papyrus.uml.diagram.common,\n"
					+ " org.eclipse.papyrus.uml.extensionpoints,\n"
					+ " org.eclipse.papyrus.uml.diagram.clazz;bundle-version=\"2.0.0\",\n"
					+ " org.eclipse.ui,\n"
					+ " org.eclipse.core.runtime,\n"
					+ " org.eclipse.papyrus.infra.viewpoints.policy,\n"
					+ " org.eclipse.papyrus.uml.tools.utils,\n"
					+ " org.eclipse.papyrus.uml.diagram.common,\n"
					+ " org.eclipse.uml2.uml,\n"
					+ " org.eclipse.core.resources,\n"
					+ " org.eclipse.papyrus.infra.viewpoints.policy,\n"
					+ " org.eclipse.papyrus.infra.gmfdiag.common,\n"
					+ " org.eclipse.papyrus.uml.diagram.composite,\n"
					+ " org.eclipse.papyrus.infra.core.log,\n"
					+ " org.eclipse.papyrus.uml.tools,\n"
					+ " org.eclipse.papyrus.uml.diagram.communication,\n"
					+ " org.eclipse.papyrus.uml.diagram.clazz,\n"
					+ " org.eclipse.papyrus.uml.diagram.activity,\n"
					+ " org.eclipse.gmf.tooling.runtime,\n"
					+ " org.eclipse.papyrus.infra.core,\n"
					+ " org.eclipse.papyrus.infra.types.core,\n"
					+ " org.eclipse.gmf.runtime.diagram.core\n");
			output.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file...");
		}
	}

	public void createTheProfileUmlFile(String theSelectedFilePath) throws Exception {
		EtlModule etlModule = new EtlModule();

		// The emfatic (ecore) source
		EmfModel sourceModel = 	createAndLoadAnEmfModel("http://www.eclipse.org/emf/2002/Ecore", theSelectedFilePath, "Source", "true", "false");
		
		// The ultimate goal: the UML profile
		UmlModel targetModel = createAndLoadAUmlModel("http://www.eclipse.org/uml2/5.0.0/UML", project.getLocation().toOSString() + File.separator + "model.profile.uml", "Profile", "false", "true");

		// The UML Metamodel
		UmlModel umlMetaModel = createAndLoadAUmlModel("http://www.eclipse.org/emf/2002/Ecore", "pathmap://UML_METAMODELS/UML.metamodel.uml", "UMLM2", "true", "false");

		// The UML Ecore Metamodel
		EmfMetaModel umlEcoreMetaModel = createAndLoadAnEmfMetaModel("http://www.eclipse.org/uml2/5.0.0/UML", "UMLEcore", "true", "false");

		// The ECore Metamodel
		EmfMetaModel ECoreMetaModel = createAndLoadAnEmfMetaModel("http://www.eclipse.org/emf/2002/Ecore", "EcoreM2", "true", "false");

		// The Ecore Primitive Types
		UmlModel ecorePrimitiveTypesModel = new UmlModel();
		StringProperties ecorePrimitiveTypesModelProperties = new StringProperties();
		ecorePrimitiveTypesModelProperties.put(UmlModel.PROPERTY_MODEL_FILE,
				"pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml");
		ecorePrimitiveTypesModelProperties.put(UmlModel.PROPERTY_NAME, "ECorePrimitiveTypes");
		ecorePrimitiveTypesModelProperties.put(UmlModel.PROPERTY_READONLOAD, "true");
		ecorePrimitiveTypesModelProperties.put(UmlModel.PROPERTY_STOREONDISPOSAL, "false");
		ecorePrimitiveTypesModel.load(ecorePrimitiveTypesModelProperties, (IRelativePathResolver) null);

		ArrayList<IModel> allTheModels = new ArrayList<IModel>();
		allTheModels.addAll(Arrays.asList(sourceModel, targetModel, umlMetaModel, umlMetaModel, umlEcoreMetaModel, ECoreMetaModel, ecorePrimitiveTypesModel));
		
		doTheETLTransformation(etlModule, allTheModels, "files/emf2umlprofile2Annotations.etl");
		
		//etlModule.getContext().getModelRepository().getModelByName("Profile").dispose();
	}

	public void createTheModelProfileNotationFile() throws IOException {
		BufferedWriter output = new BufferedWriter(
				new FileWriter(project.getLocation().toOSString() + File.separator + "model.profile.notation", false));
		try {
			output.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
					+ "<xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\"/>\n");
			output.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file...");
		}
	}

	public void createTheModelProfileDiFile() throws IOException {
		BufferedWriter output = new BufferedWriter(
				new FileWriter(project.getLocation().toOSString() + File.separator + "model.profile.di", false));
		try {
			output.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
					+ "<xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\"/>\n");
			output.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file...");
		}
	}

	public void createThebuildPropertiesFile() throws IOException {
		BufferedWriter output = new BufferedWriter(
				new FileWriter(project.getLocation().toOSString() + File.separator + "build.properties", false));
		try {
			output.write("bin.includes = META-INF/,\\\n" + "plugin.xml\n");
			output.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file...");
		}
	}

	public void copyTheIcons(String theSelectedFilePath, String theParentFolder) throws IOException {

		ArrayList<String> iconPaths = getTheListOfIconPathsInModel(theSelectedFilePath);
		for (String iconPath : iconPaths) {

			// In order to be able to do the copy, I need firstly to create the
			// target directory. I do that by striping the name of the file.
			// The target directory is: the target project location + the
			// content of the icon details set in EMF without the file name.
			String theTargetDirectory = project.getLocation().toOSString() + File.separator
					+ iconPath.substring(0, iconPath.lastIndexOf("/"));
			File targetDir = new File(theTargetDirectory);
			if (!targetDir.exists()) {
				targetDir.mkdir();
			}
			String fromIconPath = theParentFolder + File.separator + iconPath;
			String toIconPath = project.getLocation().toOSString() + File.separator + iconPath;
			copyFiles(fromIconPath, toIconPath);

		}
	}

	public void copyTheShapes(String theSelectedFilePath, String theParentFolder) throws IOException {
		ArrayList<String> shapePaths = getTheListOfShapePathsInModel(theSelectedFilePath);
		for (String shapePath : shapePaths) {
			// In order to be able to do the copy, I need firstly to create the
			// target directory. I do that by striping the name of the file.
			// The target directory is: the target project location + the
			// content of the shape details set in EMF without the file name.
			String theTargetDirectory = project.getLocation().toOSString() + File.separator
					+ shapePath.substring(0, shapePath.lastIndexOf("/"));
			File targetDir = new File(theTargetDirectory);
			if (!targetDir.exists()) {
				targetDir.mkdir();
			}
			String fromShapePath = theParentFolder + File.separator + shapePath;
			String toShapePath = project.getLocation().toOSString() + File.separator + shapePath;
			copyFiles(fromShapePath, toShapePath);
		}
	}

	private void copyFiles(String from, String to) throws IOException {

		Path fromPath = Paths.get(from);
		Path toPath = Paths.get(to);
		CopyOption[] options = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING,
				StandardCopyOption.COPY_ATTRIBUTES };
		java.nio.file.Files.copy(fromPath, toPath, options);
	}

	private ArrayList<String> getTheListOfIconPathsInModel(String theSelectedFilePath) {
		File f = new File(theSelectedFilePath);
		URI fileURI = URI.createFileURI(f.getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource1 = resourceSet.getResource(fileURI, true);
		ArrayList<String> iconPaths = new ArrayList<String>();
		TreeIterator<EObject> allContents = resource1.getAllContents();
		while (allContents.hasNext()) {
			EObject next = allContents.next();
			if (next instanceof EAnnotation) {
				EAnnotation annotation = (EAnnotation) next;
				for (String theKey : annotation.getDetails().keySet()) {
					if (theKey.equals("icon")) {
						iconPaths.add(annotation.getDetails().get(theKey));
					}
				}
			}
		}
		return iconPaths;
	}

	private ArrayList<String> getTheListOfShapePathsInModel(String theSelectedFilePath) {
		File f = new File(theSelectedFilePath);
		URI fileURI = URI.createFileURI(f.getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource1 = resourceSet.getResource(fileURI, true);
		ArrayList<String> shapePaths = new ArrayList<String>();
		TreeIterator<EObject> allContents = resource1.getAllContents();
		while (allContents.hasNext()) {
			EObject next = allContents.next();
			if (next instanceof EAnnotation) {
				EAnnotation annotation = (EAnnotation) next;
				for (String theKey : annotation.getDetails().keySet()) {
					if (theKey.equals("shape")) {
						shapePaths.add(annotation.getDetails().get(theKey));
					}
				}
			}
		}
		return shapePaths;
	}

	private String getNameOfEPackage(String theSelectedFilePath) {
		// The emfatic (ecore) source
		File f = new File(theSelectedFilePath);
		URI fileURI = URI.createFileURI(f.getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource1 = resourceSet.getResource(fileURI, true);
		EPackage wdwPackage = (EPackage) resource1.getContents().get(0);

		return wdwPackage.getName();
	}
	
	private EmfModel createAndLoadAnEmfModel(String metamodelURI, String modelFile, String modelName, String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		EmfModel theModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodelURI);
		properties.put(EmfModel.PROPERTY_MODEL_FILE, modelFile);
		properties.put(EmfModel.PROPERTY_NAME, modelName);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		theModel.load(properties, (IRelativePathResolver) null);
		return theModel;
	}
	
	private EmfMetaModel createAndLoadAnEmfMetaModel(String metamodelUri, String modelName, String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		EmfMetaModel metamodel = new EmfMetaModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfMetaModel.PROPERTY_METAMODEL_URI, metamodelUri);
		properties.put(EmfMetaModel.PROPERTY_NAME, modelName);
		properties.put(EmfMetaModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfMetaModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		metamodel.load(properties, (IRelativePathResolver) null);
		return metamodel;
	}
	
	private UmlModel createAndLoadAUmlModel(String metamodelUri, String modelFile, String modelName, String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		UmlModel umlModel = new UmlModel();
		StringProperties properties = new StringProperties();
		properties.put(UmlModel.PROPERTY_METAMODEL_URI, metamodelUri);
		properties.put(UmlModel.PROPERTY_MODEL_FILE, modelFile);
		properties.put(UmlModel.PROPERTY_NAME, modelName);
		properties.put(UmlModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(UmlModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		umlModel.load(properties, (IRelativePathResolver) null);
		return umlModel;
	}
	
	private void doTheETLTransformation(EtlModule etlModule, ArrayList<IModel> allTheModels, String theFile) throws Exception {
		for (IModel theModel : allTheModels) {
			etlModule.getContext().getModelRepository().addModel(theModel);
		}
		java.net.URI etlFile = Activator.getDefault().getBundle()
				.getResource(theFile).toURI();
		etlModule.parse(etlFile);
		etlModule.execute();
		etlModule.getContext().getModelRepository().dispose();
	}

	public void refresh() throws CoreException {
		project.refreshLocal(1, null);
	}

}