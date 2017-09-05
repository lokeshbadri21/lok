package testScripts;
import org.testng.annotations.Test;

import BuisnessFunctions.Login;
public class Tc1Login extends Roottest
{

	static Login login=new Login(brow);
	@Test
	public static void verifyOrangeHRM() throws Exception
	{
		brow.startBrowserChrome();
		brow.maximiseBrowser();
        brow.verifytitle("OrangeHRM - New Level of HR Management");
		login.setUp();
		login.loginToapp("qaplanet1","user1");
		brow. WaitForPageToLoad();
	    brow.verifytitle("OrangeHRM");
		login.logout();
		brow.closeBrowser();
		brow.QuitObject();
	}
}
