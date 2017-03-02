package newautogenofproject;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.pde.internal.core.natures.PDE;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.internal.EglModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;

public class ThingsAreHappeningHere {
	
	String name = "GeneratedProfile";
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
}
