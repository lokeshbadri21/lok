package testScripts;

import org.testng.annotations.Test;

import BuisnessFunctions.Admin;
import BuisnessFunctions.Login;

public class Tc3addloc  extends Roottest
{

	static Login login=new Login(brow);
    static Admin admin=new Admin(brow);
	@Test
	public static void addlocation() throws Exception
	{
		brow.startBrowserChrome();
		brow.maximiseBrowser();
        brow.verifytitle("OrangeHRM - New Level of HR Management");
		login.setUp();
		login.loginToapp("qaplanet1","user1");
		brow. WaitForPageToLoad();
	    brow.verifytitle("OrangeHRM");
	    admin.addlocation("Badri", "India", "Andhra Pradesh", "Nellore", "Brahmana Street", "123456", "9988998899", "123654");
		admin.verifyItemlocList("Name","Badri");
	   login.logout();
		brow.closeBrowser();
		brow.QuitObject();
	}
}


