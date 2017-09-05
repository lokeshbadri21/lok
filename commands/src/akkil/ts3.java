package akkil;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ts3 
 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://classroom:90/qahrm");
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
		
		WebElement Objaddemp=Driver.findElement(By.linkText("PIM"));
		A.moveToElement(Objaddemp).perform();
		A.moveToElement(Driver.findElement(By.linkText("Employee List"))).perform();
		
		A.moveToElement(Driver.findElement(By.linkText("Add Employee"))).click().perform();
		Driver.switchTo().frame("rightMenu");
		WebElement Objt1=Driver.findElement(By.xpath("html/body/form/div/div[1]/div[2]/div[1]/h2"));
		if(Objt1.isDisplayed())
		{
			System.out.println("sub title disp");
		}
		else 
		{
			System.out.println("sub title not disp");
		
			return;
		}
		WebElement Objsave=Driver.findElement(By.xpath("html/body/form/div/div[1]/div[2]/div[2]/input[1]"));
		Objsave.click();
		Alert A1=Wait.until(ExpectedConditions.alertIsPresent());
		if(A1.getText().equals("Last Name Empty!"))
		{
			System.out.println("last name empty");
			
		}
		else
		{
			System.out.println(" Last Name Emptynot disp !");
			
		}
		String f="Akil";
		String l="Badri";
		
			A1.accept();
			WebElement Objln=Driver.findElement(By.name("txtEmpLastName"));
			Objln.sendKeys(l);
			Objsave.click();
			if(A1.getText().equals("First Name Empty!"))
			{
				System.out.println("First Name Empty!");
				
			}
			else
			{
				System.out.println(" First Name Empty! disp !");
				
			}
				A1.accept();
		
				WebElement Objfn=Driver.findElement(By.name("txtEmpFirstName"));
				Objfn.sendKeys(f);
				Objsave.click();
			String  str=Driver.findElement(By.xpath("html/body/form/div[2]/div[1]/div[2]/div[1]/h2")).getText();
				if(str.equals("Personal Details"))
				
				{
					System.out.println("pd is displayed");
				}
				else
				{
					System.out.println("ps is not disp");
					
				}
		
		     WebElement Objedit=Driver.findElement(By.xpath("//*[@id='btnEditPers']") );
		     if(Objedit.isDisplayed())
		     {
		    	 System.out.println("edit page displayed");
		     }
		     else
		     {
		    	 System.out.println("edit page is not displayed");
		     }
		     
		     
		     Objedit.click();
		     
		     WebElement Objln1=Driver.findElement(By.xpath(".//*[@id='txtEmpLastName']"));
		     Objln1.clear();
		     String o="Lokesh";
		     //WebElement Objln2=Driver.findElement(By.xpath(".//*[@id='txtEmpLastName']"));
		     Objln1.sendKeys(o);
		     WebElement Objsave1=Driver.findElement(By.xpath(".//*[@id='btnEditPers']"));
		     if(Objsave1.isDisplayed())
		     {
		    	 System.out.println("save page displayed");
		     }
		     else
		     {
		    	 System.out.println("save page not displayed");
		     }
		     Objsave1.click();
		     WebElement Objback=Driver.findElement(By.xpath("html/body/div[5]/input"));
		     if(Objback.isDisplayed())
		     {
		    	 System.out.println("back page displayed");
		     }
		     else
		     {
		    	 System.out.println("back page not displayed");
		     }
		     Objback.click();
		     
		     
		     
		     
		     
		     
		     
		     
		     
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


