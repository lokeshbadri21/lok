package akkil;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ts18Compantstructure {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://apps.qaplanet.in/qahrm/login.php");
		Driver.manage().window().maximize();
	WebDriverWait Wait=new WebDriverWait(Driver, 40);
	WebElement ObjUn=Driver.findElement(By.name("txtUserName"));
	WebElement Objpd=Driver.findElement(By.name("txtPassword"));
	WebElement Objlog=Driver.findElement(By.name("Submit"));	
	WebElement Objclr=Driver.findElement(By.name("clear"));	
	if(ObjUn.isDisplayed() )
	{
		System.out.println("un  disp");
	}
	if(Objpd.isDisplayed() )
	{
		System.out.println("pd disp");
		
	}
    if(Objlog.isDisplayed())
	{
	    System.out.println("log disp");
	}
	if(Objclr.isDisplayed())
	{
		System.out.println("clr disp");
	}
	
	   
	   ObjUn.sendKeys("qaplanet1");
	   Objpd.sendKeys("user1");
	   Objlog.click();
	   
	   if(Wait.until(ExpectedConditions.titleIs("OrangeHRM")))
	   {
		   System.out.println("home pg disp");
	   }
	   WebElement Objwlcom=Driver.findElement(By.xpath("html/body/div[3]/ul/li[1]"));
	   
	   
		if(Objwlcom.isDisplayed())
		{
			System.out.println("wlcom page disp");
		}
	 WebElement Objchpd=Driver.findElement(By.xpath("html/body/div[3]/ul/li[2]/a"));
		
	 
		if(Objchpd.isDisplayed())
		{
			System.out.println("chg pwd disp");
		}
		
		WebElement Objlgout=Driver.findElement(By.xpath("html/body/div[3]/ul/li[3]/a"));
		
		 
		if(Objlgout.isDisplayed())
		{
			System.out.println("logout disp");
		}
		Actions A=new Actions(Driver);
		
		WebElement Objcompinfo=Driver.findElement(By.linkText("Admin"));
		A.moveToElement(Objcompinfo).perform();
	
		ArrayList<String> A2=new ArrayList<String>();
	    A2.add("Company Info");
        A2 .add("Job");
	    A2.add("Qualification");
	    A2.add("Skills");
	    A2.add("Memberships");
	    A2.add("Nationality & Race");
	    A2.add("Users");
	    A2.add("Email Notifications");
	    	A2.add("Project Info");
	    	A2.add("Data Import/Export");
	      A2.add("Custom Fields");    
	  
		System.out.println("list of elements"+A2);
	
		   A.moveToElement(Driver.findElement(By.linkText("Company Info"))).perform();
		ArrayList<String> A3=new ArrayList<String>();
		
		
	   
		A3.add("General");
		A3.add("Locations");
		A3.add("Company Structure");
		A3.add("Company Property");
		System.out.println("list of elements"+A3);

		A.moveToElement(Driver.findElement(By.linkText("Company Structure"))).click().perform();
		System.out.println("Company Structure is displayed");
		Driver.switchTo().frame("rightMenu");

        WebElement structure=Driver.findElement(By.xpath(".//*[@id='layerComStruct']/h2"));
        if(structure.isDisplayed())
        {
        	System.out.println("comp str is disp");
        }
        else
        {
        	System.out.println("comp str is not disp");
        }
          
          WebElement add=Driver.findElement(By.xpath(".//*[@id='tblCompStruct']/tbody/tr[1]/td[2]/a"));
          add.click();
          
          WebElement id=Driver.findElement(By.xpath(".//*[@id='txtDeptId']"));
          id.sendKeys("43");
          WebElement name =Driver.findElement(By.xpath(".//*[@id='txtTitle']"));
          name.sendKeys("loke");
          
          WebElement sel=Driver.findElement(By.xpath(".//*[@id='cmbType']"));
	      sel.sendKeys("Division");
          WebElement location=Driver.findElement(By.xpath(".//*[@id='cmbLocation']"));
	      location.sendKeys("purna");
	      WebElement desc=Driver.findElement(By.xpath(".//*[@id='txtDesc']"));
	      desc.sendKeys("loke is a worst fellow for worst fellows");
	
	      WebElement save=Driver.findElement(By.xpath(".//*[@id='frmAddNode']/div/input[1]"));
	      save.click();
	
	      WebElement sucess=Driver.findElement(By.linkText("143 loke Division"));
	      if(sucess.isDisplayed())
	      {
		  System.out.println("add is displayed");
	      }
	      else
	      {
		  System.out.println("add is not displayed");
	      }
	    
	     WebElement edit=Driver.findElement(By.xpath(".//*[@id='tblCompStruct']/tbody/tr[28]/td[1]/a"));
	     edit.click();
	     WebElement id1=Driver.findElement(By.xpath(".//*[@id='txtDeptId']"));
	     id1.clear();
         id1.sendKeys("9573112189");
         WebElement savee=Driver.findElement(By.xpath(".//*[@id='frmAddNode']/div/input[1]"));
         savee.click();
         WebElement dele=Driver.findElement(By.xpath(".//*[@id='tblCompStruct']/tbody/tr[31]/td[4]/a"));
	     dele.click();
		  Alert popup=Driver.switchTo().alert();
			System.out.println(popup.getText());
			popup.accept();
		  
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	    Driver.switchTo().defaultContent();
          WebElement objLogout=Driver.findElement(By.linkText("Logout"));

          if(objLogout.isDisplayed())
           {
              System.out.println("hp is disp");
             }
               else
                 {
                   System.out.println("hp is not disp");
                 }

                   objLogout.click();

                   
                   
                   
                   
                  
Driver.close();
Driver.quit();

}

	
	}
	
	
	


