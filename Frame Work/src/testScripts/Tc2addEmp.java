package testScripts;
import org.testng.annotations.Test;

import BuisnessFunctions.Login;

public class Tc2addEmp extends Roottest
{
	
	
	
		static Login login=new Login(brow);
		@Test
		public static void AddEmployee() throws Exception
		{
			brow.startBrowserChrome();
			brow.maximiseBrowser();
			//verify title
			brow.verifytitle("OrangeHRM - New Level of HR Management");
			login.setUp();
			login.loginToapp("qaplanet1","user1");
			brow.WaitForPageToLoad();
			//verify title
			brow.verifytitle("OrangeHRM");
			login.addEmp("QA","Planet");
			login.verifyItemInEmpList("QA","Planet");
			login.logout();
			brow.closeBrowser();
			brow.QuitObject();
		}
	

}
