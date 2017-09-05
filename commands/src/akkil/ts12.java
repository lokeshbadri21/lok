package akkil;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.text.SimpleDateFormat;

import org.eclipse.jetty.util.statistic.SampleStatistic;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ts12 
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
	
		   A.moveToElement(Driver.findElement(By.linkText("Job"))).perform();
		ArrayList<String> A3=new ArrayList<String>();
		
		
	   
		A3.add("Job Titles");
		A3.add("Job Specifications");
		A3.add("Pay Grades");
		A3.add("Employment Status");
		A3.add("EEO Job Categories");
		System.out.println("list of elements"+A3);

		A.moveToElement(Driver.findElement(By.linkText("Job Specifications"))).click().perform();
		System.out.println("Job Titles page must be displayed");
		Driver.switchTo().frame("rightMenu");
		
		String ObjverJobt=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[1]/h2")).getText();
		
		if(ObjverJobt.equals("Job : Job Specifications"))
		{
			System.out.println("job spec is disp");
		}
		else
		{
			System.out.println("job spec  is not disp");
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
		
		
		
		
		
		WebElement name22=Driver.findElement(By.xpath(".//*[@id='txtFieldName']"));
		name22.sendKeys("balayya");
		WebElement name23=Driver.findElement(By.xpath(".//*[@id='txtDesc']"));
		name23.sendKeys("he is a gud boy");
		WebElement name234=Driver.findElement(By.xpath(".//*[@id='txtDuties']"));
		name234.sendKeys("tester");
		WebElement name2345=Driver.findElement(By.xpath(".//*[@id='editBtn']"));
		name2345.click();
	
		WebElement SuccessfullyAdded=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/span"));
		if(SuccessfullyAdded.isDisplayed())
				{
			System.out.println(" Successfully Added");
			
				}
		else
		{
			System.out.println("not Successfully Added");
			return;
		}
		
		WebElement sch1=Driver.findElement(By.xpath(".//*[@id='loc_code']"));
		sch1.sendKeys("Name");
		WebElement sch2=Driver.findElement(By.xpath(".//*[@id='loc_name']"));
		sch2.sendKeys("balayya");
		
		WebElement sch3=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[3]/input[2]"));
		sch3.click();
	    
		
		
	WebElement edit11=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/table/tbody/tr[1]/td[3]/a"));
	edit11.click();
		
		WebElement edit44=Driver.findElement(By.xpath(".//*[@id='editBtn']"));
		edit44.click();
		WebElement jobsp=Driver.findElement(By.xpath(".//*[@id='txtFieldName']"));
		jobsp.clear();
		jobsp.sendKeys("babu"+Date1);
		WebElement savo=Driver.findElement(By.xpath(".//*[@id='editBtn']"));
		savo.click();
		
		WebElement upd4=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/span"));
		if(upd4.isDisplayed())
		{
			System.out.println("updated");
		}
		else
		{
			System.out.println("not updated");
			
		}
		
	
	WebElement deleted=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/table/tbody/tr[4]/td[1]/input"));
	deleted.click();
	
		WebElement delet=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[4]/div[1]/input[2]"));
		delet.click();
		Alert klo=Driver.switchTo().alert();
		System.out.println(klo.getText());
		klo.accept();
		
		
	
	WebElement upd5=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/span"));
	if(upd5.isDisplayed())
	{
		System.out.println("deleted");
	}
	else
	{
		System.out.println("not deleted");
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}  

}
