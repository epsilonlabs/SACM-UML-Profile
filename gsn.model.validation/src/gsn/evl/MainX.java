package gsn.evl;

import examples.EvlStandaloneExample;

public class MainX {

	public static void main(String[] args) {
		try {
			RunEvl evl = new RunEvl();
			evl.run();
		
//			EolStandaloneMetamodelByUriExample.main(null);
//			EvlStandaloneExample.main(null);
		} 
		catch (Exception e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
