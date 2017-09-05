package akkil;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ts8 
{
	public static void main(String[] args)throws Exception
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

		A.moveToElement(Driver.findElement(By.linkText("Locations"))).click().perform();
		System.out.println("loaction page is displayed");
		Driver.switchTo().frame("rightMenu");
		
		String Objvercompinfo=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[1]/h2")).getText();
		
		if(Objvercompinfo.equals("Company Info : Locations"))
		{
			System.out.println("loactions page ios disp");
		}
		else
		{
			System.out.println("location page is nmot disp");
			return;
		}
		String Objsearchby=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/label[1]")).getText();
		if(Objsearchby.equals("Search By:"))
		{
			System.out.println("Search By: page ios disp");
		}
		else
		{
			System.out.println("Search By: is nmot disp");
			return;
		}
		
		
		WebElement Objsear=Driver.findElement(By.xpath(".//*[@id='loc_code']"));
		if(Objsear.isDisplayed())
		{
			System.out.println("loc_code is disp");
		}
		else
		{
			System.out.println("Sear  is nmot disp");
			return;
		}
	
		WebElement Objsearcbt=Driver.findElement(By.className("plainbtn"));
		
		if(Objsearcbt.isDisplayed())
		{
			System.out.println("sear bt is disp");
		}
		else
		{
			System.out.println("Sear bt not disp");
			return;
        }
		
		WebElement Objreset=Driver.findElement(By.className("plainbtn"));
		
		if(Objreset.isDisplayed())
			
		{
			System.out.println("reset is disp");
		}
		else
		{
			System.out.println("reset is not disp");
			return;
        }
	WebElement Objaddbt=Driver.findElement(By.className("plainbtn"));
	
		
		if(Objaddbt.isDisplayed())
			
		{
			System.out.println("add bt is disp");
		}
		else
		{
			System.out.println("add  bt is not disp");
			return;
        }
		
         WebElement Objdel=Driver.findElement(By.className("plainbtn"));
	
		
		if(Objdel.isDisplayed())
			
		{
			System.out.println("delete bt is disp");
		}
		else
		{
			System.out.println("delete bt is not disp");
			return;
        }
		
		   WebElement Objadd=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[3]/div[1]/input[1]"));
			
		   Objadd.click();
		   
		
		   String Objcompinf=Driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/h2")).getText();
		   if(Objcompinf.equals("Company Info : Locations"))
		   {
			   System.out.println("company location is disp ");
		   }
		   else
		   {
			   System.out.println("company location is disp ");
		   }
		
		   WebElement Objn=Driver.findElement(By.name("txtLocDescription"));
			WebElement Objcntry=Driver.findElement(By.name("cmbCountry"));
			WebElement Objstate=Driver.findElement(By.name("txtState"));	
			WebElement Objcity=Driver.findElement(By.name("cmbDistrict"));	
			WebElement Objaddr=Driver.findElement(By.name("txtAddress"));	
			WebElement Objzip=Driver.findElement(By.name("txtZIP"));	
			WebElement Objphone=Driver.findElement(By.name("txtPhone"));	
			WebElement Objfax=Driver.findElement(By.name("txtFax"));	
			WebElement Objcomments=Driver.findElement(By.name("txtComments"));	
			if(Objn.isDisplayed() )
			{
				System.out.println("name  disp");
			}
			if(Objcntry.isDisplayed() )
			{
				System.out.println("country disp");
				
			}
		    if(Objstate.isDisplayed())
			{
			    System.out.println("state disp");
			}
			if(Objcity.isDisplayed())
			{
				System.out.println("city disp");
			}
			if(Objaddr.isDisplayed() )
			{
				System.out.println("address disp");
			}
			if(Objzip.isDisplayed() )
			{
				System.out.println("zipcode disp");
				
			}
		    if(Objphone.isDisplayed())
			{
			    System.out.println("phone disp");
			}
			if(Objfax.isDisplayed())
			{
				System.out.println("fax disp");
			}
			if(Objcomments.isDisplayed())
			{
				System.out.println("comments disp");
			}
			
			
			 WebElement Objsavee=Driver.findElement(By.xpath("//*[@id='editBtn']"));
			
			 Objsavee.click();
			 System.out.println("all fields are blank and click on save");
	         
			 
			Alert A1=Driver.switchTo().alert();
						 
			 System.out.println(A1.getText());
			 A1.accept();
			
			 Objn.sendKeys("lokesh");
		
			 Objsavee.click();
			 System.out.println(A1.getText());
			 A1.accept();
			
			 Objcntry.sendKeys("India");
		
			 Objsavee.click();
			 System.out.println(A1.getText());
			 A1.accept();
			 
			 Objaddr.sendKeys("Badri's Area");
		
			 Objsavee.click();
			 System.out.println(A1.getText());
			 A1.accept();

			 Objzip.sendKeys("524126");
			 Objsavee.click();
			 
			 WebElement Objfinalloc=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[1]/h2"));
			 Thread.sleep(2000);
			 
			 if(Objfinalloc.isDisplayed())
					 {
				 System.out.println("comp locations");
					 }
			 else
			 {
				 System.out.println("comp locations not disp");
					 }
			 int rc=Driver.findElements(By.xpath("html/body/div/div[2]/form/table/tbody/tr")).size();
			
			 int i;
			 for(i=4;i<7;i++)
			 {
				 Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/table/tbody/tr["+i+"]/td[1]/input")).click();
			 }
			 WebElement delete=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[4]/div[1]/input[2]"));
			 delete.click();
			 System.out.println(A1.getText());
			 A1.accept();
			 WebElement upd3=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/span"));
			 if(upd3.isDisplayed())
			 {
	             System.out.println("deleted sucessfully");
	            
			 }
			 else
			 {
				 System.out.println("not deleted sucessfully");
			 }
			 
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

			 
	}

	
	}
	


