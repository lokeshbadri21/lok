package BuisnessFunctions;

import LIB.common;

public class Admin 

{
	 common browser;
	public Admin(common br)
	{
		browser=br;
	}
	public void addlocation(String name,String Country,String State,String City,String Address,String ZIPcode,String Phone,String Fax)
	{
		browser.startAction();
		browser.MouseOverToElement("xpath", "//*[@id='admin']/a/span");
		browser.MouseOverToElement("xpath", "//*[@id='admin']/ul/li[1]/a/span");
		browser.click("xpath", "//*[@id='admin']/ul/li[1]/ul/li[2]/a/span");
	    browser.selectFrameById("rightMenu");	
		browser.verifyText("xpath", "html/body/div[1]/div[2]/form/div[1]/h2", "Company Info : Locations");
		browser.click("xpath", "html/body/div[1]/div[2]/form/div[3]/div[1]/input[1]");
		browser.sendkeys("id", "txtLocDescription", name);
		browser.select("id", "cmbCountry", Country);
		browser.sendkeys("id", "txtState", State);
		browser.sendkeys("id", "cmbDistrict", City);
		browser.sendkeys("id", "txtAddress", Address);
		browser.sendkeys("id", "txtZIP", ZIPcode);
		browser.sendkeys("id", "txtPhone", Phone);
		browser.sendkeys("id", "txtFax", Fax);
	    browser.click("xpath", ".//*[@id='editBtn']");
	    browser.waitUntilElementPresent("html/body/div[1]/div[2]/form/div[1]/h2");
	    browser.verifyText("xpath", "html/body/div[1]/div[2]/form/div[2]/span", "Successfully Added");
	  
	
	
	}	
   

   public void verifyItemlocList(String text,String content)throws Exception
   
   {
	 //  browser.selectFrameById("rightMenu");
	   browser.verifyText("xpath", "html/body/div[1]/div[2]/form/div[1]/h2", "Company Info : Locations");
	   
       browser.select("id", "loc_code", text);
		//wait for 2 sec
		browser.sleepThread(2000);

       browser.sendkeys("xpath","//*[@id='loc_name']", content);
       
     //wait for 2 sec
     		browser.sleepThread(2000);
       browser.click("xpath", "//input[@value='Search']");
       
       
   }
   
   public void EditLoc(String name,String Country,String State,String City,String Address)throws Exception
   {
	   browser.click("xpath", "html/body/div[1]/div[2]/form/table/tbody/tr[40]/td[3]/a");
	   browser.sleepThread(1000);
	   browser.click("xpath", "//input[@id='editBtn']");
	   browser.sleepThread(1000);
	   browser.sendkeys("id", "txtLocDescription", name);
	   browser.select("id", "cmbCountry", Country);
	   browser.sendkeys("id", "txtState", State);
	   browser.sendkeys("id", "cmbDistrict", City);
	   browser.sendkeys("id", "txtAddress", Address);
	   browser.click("xpath", ".//*[@id='editBtn']"); 
       browser.waitUntilElementPresent("//html/body/div[1]/div[2]/form/div[2]/span");
       browser.verifyText("xpath", "//html/body/div[1]/div[2]/form/div[2]/span", "Successfully Updated" );
         
   }
   
   public void deleteLoc(String text,String content)throws Exception
   
   {
                 
	   browser.select("id", "loc_code", text);
		//wait for 2 sec
		browser.sleepThread(2000);

      browser.sendkeys("xpath","//*[@id='loc_name']", content);
   
      browser.sleepThread(2000);
      browser.click("xpath", "//input[@value='Search']");
      browser.click("xpath", "//html/body/div/div[2]/form/table/thead/tr/td[1]/input");
      browser.click("xpath", "//input[@value='Delete']");
      browser.alert();
   
   
   
   }


   public void addjobtitle(String name,String namedesc,String txttc,String cmbjobid)
	{
		browser.startAction();
		browser.MouseOverToElement("xpath", "//*[@id='admin']/a/span");
		browser.MouseOverToElement("xpath","//*[@id='admin']/ul/li[2]/a/span");
		browser.click("xpath", "//*[@id='admin']/ul/li[2]/ul/li[1]/a/span");
	    browser.selectFrameById("rightMenu");	
		browser.verifyText("xpath", "html/body/div[1]/div[2]/form/div[1]/h2", "Job : Job Title");
		browser.click("xpath", "html/body/div[1]/div[2]/form/div[3]/div[1]/input[1]");
		browser.sendkeys("id", "txtJobTitleName", name);
		browser.sendkeys("id", "txtJobTitleDesc", namedesc);
		browser.sendkeys("id", "txtJobTitleComments", txttc);
	    browser.select("id", "cmbJobSpecId", cmbjobid);
	    browser.click("xpath", ".//*[@id='frmJobTitle']/div[2]/input[1]");
	    browser.waitUntilElementPresent("html/body/div[2]/div[2]/div[2]/div[1]/h2");
	    browser.verifyText("xpath", "html/body/div[2]/div[2]/div[2]/div[1]/h2", "Job : Job Title");


}


 public void verifyjobtitList(String text,String content)throws Exception
   
   {
	 browser.click("xpath", "html/body/div[2]/div[1]/input");
	 
	 //  browser.selectFrameById("rightMenu");
	   browser.verifyText("xpath", "html/body/div[1]/div[2]/form/div[1]/h2", "Job : Job Title");
	   
       browser.select("id", "loc_code", text);
		//wait for 2 sec
		browser.sleepThread(2000);

       browser.sendkeys("xpath","//*[@id='loc_name']", content);
       
     //wait for 2 sec
     		browser.sleepThread(2000);
       browser.click("xpath", "//input[@value='Search']");
       
       
   }

 public void Editjobtitle(String name,String namedesc)throws Exception
 {
	   browser.click("xpath", "html/body/div[1]/div[2]/form/table/tbody/tr/td[3]/a");
	   browser.sleepThread(1000);
	   browser.click("xpath", "//input[@id='editBtn']");
	   browser.sleepThread(1000);
	   browser.sendkeys("id", "txtJobTitleName", name);
		browser.sendkeys("id", "txtJobTitleDesc", namedesc);
	 
	   browser.click("xpath", "//*[@id='editBtn']"); 
     browser.waitUntilElementPresent("//html/body/div[1]/div[2]/form/div[2]/span");
     browser.verifyText("xpath", "//html/body/div[1]/div[2]/form/div[2]/span", "Successfully Updated" );
       
 }

}
   

   
   
   

   
   
   
   
   
   
   
   
   
   
   
   
