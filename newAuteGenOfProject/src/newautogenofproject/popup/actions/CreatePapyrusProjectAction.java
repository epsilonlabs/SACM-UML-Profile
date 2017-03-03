package newautogenofproject.popup.actions;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import newautogenofproject.ThingsAreHappeningHere;

public class CreatePapyrusProjectAction implements IObjectActionDelegate {

	private Shell shell;
	private String theSelectedFilePath;
	
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
        theSelectedFilePath = file.getLocation().toString();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		
		ThingsAreHappeningHere tahh = new ThingsAreHappeningHere(theSelectedFilePath);
		
		try {
			tahh.createPluginProject(theSelectedFilePath);
			tahh.createThePalette(theSelectedFilePath);
			tahh.createThePluginXml(theSelectedFilePath);
			tahh.createTheManifestFile(theSelectedFilePath);
			tahh.createTheProfileUmlFile(theSelectedFilePath);
			tahh.createTheModelProfileNotationFile();
			tahh.createTheModelProfileDiFile();
			tahh.createThebuildPropertiesFile();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
