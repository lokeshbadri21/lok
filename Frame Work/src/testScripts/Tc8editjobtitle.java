package testScripts;

import org.testng.annotations.Test;

import BuisnessFunctions.Admin;
import BuisnessFunctions.Login;

public class Tc8editjobtitle extends Roottest
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
	    admin.addjobtitle("Akiltester", "abcdef", "architect", " hfh");
		admin.verifyjobtitList("Name", "lokesh123456");
	    admin.Editjobtitle("Name", "lokesh12345678");
	 
	    
	    
	   /*   login.logout();
		brow.closeBrowser();
		brow.QuitObject();
*/
}
}



