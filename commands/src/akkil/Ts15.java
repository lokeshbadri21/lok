package akkil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ts15 
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
	
		   A.moveToElement(Driver.findElement(By.linkText("Qualification"))).perform();
		ArrayList<String> A3=new ArrayList<String>();
		
		
	   
		A3.add("Education");
		A3.add("Licenses");
		
		System.out.println("list of elements"+A3);

		A.moveToElement(Driver.findElement(By.linkText("Education"))).click().perform();
		System.out.println("Education page must be displayed");
		Driver.switchTo().frame("rightMenu");
		
		String ObjverJobt=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[1]/h2")).getText();
		
		if(ObjverJobt.equals("Qualification : Education"))
		{
			System.out.println("edu page is disp");
		}
		else
		{
			System.out.println("edu page  is not disp");
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
			System.out.println("sear is disp");
		}
		else
		{
			System.out.println("Sear  is not disp");
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
		
		
	
		WebElement Objadd1=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[3]/div[1]/input[1]"));
		Objadd1.click();
		DateFormat dtf=new SimpleDateFormat("MM/DD/YYYY HH:MM:SS");
		Date date=new Date();
		String Date1=dtf.format(date);
		System.out.println(Date1);
		
		WebElement inst=Driver.findElement(By.xpath(".//*[@id='txtUni']"));
		inst.click();
		inst.sendKeys("k121");
		
		WebElement edu=Driver.findElement(By.xpath(".//*[@id='txtDeg']"));
		edu.click();
		edu.sendKeys("cse");
	
		WebElement save=Driver.findElement(By.xpath(".//*[@id='editBtn']"));
	    save.click();
	    
	
	WebElement edit=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/table/tbody/tr[24]/td[3]/a"));
	edit.click();
	WebElement edits=Driver.findElement(By.xpath(".//*[@id='editBtn']"));
	edits.click();
	
	WebElement editss=Driver.findElement(By.xpath(".//*[@id='txtUni']"));
	editss.clear();
	editss.sendKeys("klu123");
	
	WebElement savee=Driver.findElement(By.xpath(".//*[@id='editBtn']"));
	savee.click();
	
	WebElement sucess=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/span"));
	if(sucess.isDisplayed())
	{
		System.out.println("updated");
	}
	else
	{
		System.out.println("not updated");
	}
	
 	
	WebElement dele=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/table/tbody/tr[26]/td[1]/input"));
	dele.click();
	WebElement delet=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[4]/div[1]/input[2]"));
	delet.click();
	Alert klo=Driver.switchTo().alert();
	System.out.println(klo.getText());
	klo.accept();
	
	WebElement deleted=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/span"));
	if(deleted.isDisplayed())
	{
		System.out.println("successfully deleted");
    }
	else
	{
		System.out.println("sucessflly not deleted");
	}
	
	 Driver.switchTo().defaultContent();
    WebElement objLogout=Driver.findElement(By.xpath(".//*[@id='option-menu']/li[3]/a"));
    
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


