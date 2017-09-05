package BuisnessFunctions;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import LIB.common;
public class Login {
	common browser;
	//constructor with one argument.
	public Login(common br)
	{
		browser=br;
	}
	//initialization and assigning of properties file 
	Properties locators =new Properties();
	File locfile= new File("C:\\vss1\\Frame Work\\src\\ElementLocators\\login.properties");
	//Setup for properties file
	public void setUp() throws Exception
	{		
		locators.load(new FileInputStream(locfile));		
	}
	//login to application (method for login to application)
	public void loginToapp(String username,String password)
	{
		String usernameloc=locators.getProperty("username.textfield.loc");
		String passwordloc =locators.getProperty("password.textfield.loc");
		String loginbtnloc=locators.getProperty("login.button.loc");

		//verify username
		//browser.verifyElementPresent("xpath", usernameloc);
		browser.Cleartextfield("xpath", usernameloc);
		browser.sendkeys("xpath", usernameloc, username);
		//verify password
		browser.verifyElementPresent("xpath",passwordloc);
		browser.Cleartextfield("xpath", passwordloc);
		browser.sendkeys("xpath", passwordloc, password);
		browser.sleepThread(1000);
		browser.verifyElementPresent("xpath", loginbtnloc);
		browser.click("xpath", loginbtnloc);
		browser.WaitForPageToLoad();
	}
	//Method for logout
	public void logout()
	{
		//select frame
		browser.selectFrameDefault();
		browser.click("linkText","Logout");
	}
	public void addEmp(String firstname,String lastname) throws Exception
	{
		//click on add emp
		browser.startAction();
		//selecting frame
		browser.selectFrameById("rightMenu");	
		//click on add button
		browser.click("xpath", "//*[@id='standardView']/div[3]/div[1]/input[1]");
		//Wait until PIM : Add Employee displayed
		browser.waitUntilElementPresent("//*[@id='frmEmp']/div/div[1]/div[2]/div[1]/h2");
		//Verify PIM : Add Employee text
		browser.verifyText("xpath", "//*[@id='frmEmp']/div/div[1]/div[2]/div[1]/h2", "PIM : Add Employee");
		//enter first and last name
		browser.sendkeys("id", "txtEmpLastName",lastname);
		browser.sendkeys("name", "txtEmpFirstName", firstname);
		//click on save button
		browser.click("id", "btnEdit");
		//wait for Personal Details 
		browser.waitUntilElementPresent("//*[@id='personal']/div[1]/div[2]/div[1]/h2");
	}
	public void verifyItemInEmpList(String firstname,String lastname)throws Exception
	{
		//select frame
		browser.selectFrameDefault();
		//click on emp list
		browser.click("linkText", "PIM");			
		//select frame
		browser.selectFrameById("rightMenu");
		//Wait for Employee info element
		browser.waitUntilElementPresent("//*[@id='standardView']/div[1]/h2");
		//verify Employee information
		browser.verifyText("xpath", "//*[@id='standardView']/div[1]/h2", "Employee Information");
		//wait for 2 sec
		browser.sleepThread(2000);
		String itemname=firstname+" "+lastname;
		browser.verifyElementInTable("//table[@class='data-table']/tbody/tr/td[3]",itemname);
	}
}
