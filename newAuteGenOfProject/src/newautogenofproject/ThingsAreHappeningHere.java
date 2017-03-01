package newautogenofproject;

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

public class ThingsAreHappeningHere {
	
	public void createPluginProject() throws CoreException {
		String name = "GeneratedProfile";
		IProgressMonitor progresMonitor = new NullProgressMonitor();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root= workspace.getRoot();
		IProject project= root.getProject(name);
		project.create(progresMonitor);
		project.open(progresMonitor);
		
		IProjectDescription desc = project.getDescription();
		desc.setNatureIds(new String[] {
		      JavaCore.NATURE_ID, PDE.PLUGIN_NATURE});
		project.setDescription(desc, progresMonitor);
	}
	

}
