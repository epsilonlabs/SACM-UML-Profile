package newautogenofproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfMetaModel;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.emc.uml.UmlModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.pde.internal.core.natures.PDE;
import org.osgi.framework.Bundle;

import newautogenofproject.popup.Activator;

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
		desc.setNatureIds(new String[] {
		      PDE.PLUGIN_NATURE});
		project.setDescription(desc, progressMonitor);
	}
		
	public void createThePalette(String theSelectedFilePath) throws Exception {
		
		
		EtlModule etlModule = new EtlModule();
		EmfModel sourceModel = new EmfModel();
		
	    StringProperties sourceProperties = new StringProperties();
	    sourceProperties.put(EmfModel.PROPERTY_METAMODEL_URI,"http://www.eclipse.org/emf/2002/Ecore");
	    sourceProperties.put(EmfModel.PROPERTY_MODEL_FILE, theSelectedFilePath);
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
	    
	    java.net.URI etlFile = Activator.getDefault().getBundle().getResource("files/paletteGenerationM2M.etl").toURI();
	    etlModule.parse(etlFile);
	    etlModule.execute();
	    etlModule.getContext().getModelRepository().dispose();
	}
	
	public void createThePluginXml(String theSelectedFilePath) throws Exception {
		EtlModule etlModule = new EtlModule();
		EmfModel sourceModel = new EmfModel();
		
	    StringProperties sourceProperties = new StringProperties();
	    sourceProperties.put(EmfModel.PROPERTY_METAMODEL_URI,"http://www.eclipse.org/emf/2002/Ecore");
	    sourceProperties.put(EmfModel.PROPERTY_MODEL_FILE, theSelectedFilePath);
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
	    java.net.URI etlFile = Activator.getDefault().getBundle().getResource("files/pluginXmlGenerationM2M.etl").toURI();
	    etlModule.parse(etlFile);
	    etlModule.execute();
	    etlModule.getContext().getModelRepository().dispose();
	}
	
	public void createTheManifestFile(String theSelectedFilePath) throws IOException {
		new File(project.getLocation() + File.separator + "META-INF").mkdir();
		BufferedWriter output = new BufferedWriter(new FileWriter(project.getLocation() + File.separator + "META-INF" + File.separator + "MANIFEST.MF", false));
		try {
			output.write("Manifest-Version: 1.0\n"
					+ "Bundle-ManifestVersion: 2\n"
					+ "Bundle-Name: " + name + "\n"
					+ "Bundle-SymbolicName: " + name + ";singleton:=true\n"
					+ "Bundle-Version: 1.0.0.qualifier\n"
					+ "Require-Bundle: org.eclipse.papyrus.uml.diagram.common,"
					+ "org.eclipse.papyrus.uml.extensionpoints,"
					+ "org.eclipse.papyrus.uml.diagram.clazz;bundle-version=\"2.0.0\"\n");
			output.close();
		} catch(IOException ex) {
            System.out.println("Error writing to file...");
    	}
	}
	
	public void createTheProfileUmlFile(String theSelectedFilePath) throws Exception {
		EtlModule etlModule = new EtlModule();
	    
		// The emfatic (ecore) source
		EmfModel sourceModel = new EmfModel();
	    StringProperties sourceProperties = new StringProperties();
	    sourceProperties.put(EmfModel.PROPERTY_METAMODEL_URI,"http://www.eclipse.org/emf/2002/Ecore");
	    sourceProperties.put(EmfModel.PROPERTY_MODEL_FILE, theSelectedFilePath);
	    sourceProperties.put(EmfModel.PROPERTY_NAME, "Source");
	    sourceProperties.put(EmfModel.PROPERTY_READONLOAD, "true");
	    sourceProperties.put(EmfModel.PROPERTY_STOREONDISPOSAL, "false");
	    sourceModel.load(sourceProperties, (IRelativePathResolver) null);
		
		// The ultimate goal: the UML profile
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
	    
	    java.net.URI etlFile = Activator.getDefault().getBundle().getResource("files/emf2umlprofile2Annotations.etl").toURI();
	    etlModule.parse(etlFile);
	    etlModule.execute();
	    etlModule.getContext().getModelRepository().getModelByName("Profile").dispose();
	}
	
	public void createTheModelProfileNotationFile() throws IOException {
		BufferedWriter output = new BufferedWriter(new FileWriter(project.getLocation() + File.separator + "model.profile.notation", false));
		try {
			output.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
					+ "<xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\"/>\n");
			output.close();
		} catch(IOException ex) {
            System.out.println("Error writing to file...");
    	}
	}
	
	public void createTheModelProfileDiFile() throws IOException {
		BufferedWriter output = new BufferedWriter(new FileWriter(project.getLocation() + File.separator + "model.profile.di", false));
		try {
			output.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
					+ "<xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\"/>\n");
			output.close();
		} catch(IOException ex) {
            System.out.println("Error writing to file...");
    	}
	}
	
	public void createThebuildPropertiesFile() throws IOException {
		BufferedWriter output = new BufferedWriter(new FileWriter(project.getLocation() + File.separator + "build.properties", false));
		try {
			output.write("bin.includes = META-INF/,\\\n"
					+ "plugin.xml\n");
			output.close();
		} catch(IOException ex) {
            System.out.println("Error writing to file...");
    	}
	}	
	
	private String getNameOfEPackage(String theSelectedFilePath) {
		// The emfatic (ecore) source
		File f = new File(theSelectedFilePath);
		URI fileURI = URI.createFileURI(f.getAbsolutePath());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl ());
					
		ResourceSet resourceSet = new ResourceSetImpl(); 
		Resource resource1 = resourceSet.getResource(fileURI, true);
		EPackage wdwPackage = (EPackage)resource1.getContents().get(0);
	   
	    return wdwPackage.getName();
	}

	public void refresh() throws CoreException {
		project.refreshLocal(1, null);
	}

}