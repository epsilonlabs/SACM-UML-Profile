package newautogenofproject.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import newautogenofproject.ThingsAreHappeningHere;

public class CreatePapyrusProjectAction implements IObjectActionDelegate {

	private Shell shell;
	private String theSelectedFilePath;
	private String theParentFolder;
	
	/**
	 * Constructor for Action1.
	 */
	public CreatePapyrusProjectAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		IStructuredSelection theSelectedFile = (IStructuredSelection) targetPart.getSite().getWorkbenchWindow().getSelectionService().getSelection();
        Object firstElement = theSelectedFile.getFirstElement();
        IFile file = (IFile) Platform.getAdapterManager().getAdapter(firstElement,IFile.class);
        theParentFolder = file.getParent().getLocation().toOSString();
        theSelectedFilePath = file.getLocation().toOSString();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		
		ThingsAreHappeningHere tahh = new ThingsAreHappeningHere(theSelectedFilePath);
		
		try {
			Job job1 = new Job("Generating Plugin Project.") {
				protected IStatus run(IProgressMonitor monitor) {
					try {
						tahh.createPluginProject(theSelectedFilePath);
						tahh.createThePalette(theSelectedFilePath);
						tahh.createThePluginXml(theSelectedFilePath);
						tahh.createTheProfileUmlFile(theSelectedFilePath);
						tahh.createTheManifestFile(theSelectedFilePath);
						tahh.createTheModelProfileNotationFile();
						tahh.createTheModelProfileDiFile();
						tahh.createThebuildPropertiesFile();
						tahh.copyTheIcons(theSelectedFilePath, theParentFolder);
						tahh.refresh();	
					} catch (Exception ex) {
						LogUtil.log(ex);
						PlatformUI.getWorkbench().getDisplay()
								.syncExec(new Runnable() {
									public void run() {
										MessageDialog
												.openError(shell, "Error",
														"An error has occured. Please see the Error Log.");
									}

								});
					} finally {
						CachedResourceSet.getCache().clear();
					}
					return Status.OK_STATUS;
				}
			};
			job1.setPriority(Job.SHORT);
			job1.schedule();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
