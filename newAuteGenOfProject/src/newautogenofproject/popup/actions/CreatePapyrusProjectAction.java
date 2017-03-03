package newautogenofproject.popup.actions;

import java.io.IOException;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import newautogenofproject.ThingsAreHappeningHere;

public class CreatePapyrusProjectAction implements IObjectActionDelegate {

	private Shell shell;
	
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
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		ThingsAreHappeningHere tahh = new ThingsAreHappeningHere();
		
		try {
			tahh.createPluginProject();
			tahh.createThePalette();
			tahh.createThePluginXml();
			tahh.createTheManifestFile();
			tahh.createTheProfileUmlFile();
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
