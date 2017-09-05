package akkil;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ts11 
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

		A.moveToElement(Driver.findElement(By.linkText("Job Titles"))).click().perform();
		System.out.println("Job Titles page must be displayed");
		Driver.switchTo().frame("rightMenu");
		
		String ObjverJobt=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[1]/h2")).getText();
		
		if(ObjverJobt.equals("Job : Job Title"))
		{
			System.out.println("job titles is disp");
		}
		else
		{
			System.out.println("job title  is not disp");
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
		
		
		WebElement Objsear=Driver.findElement(By.xpath("//*[@id='loc_code']"));
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
	
		   WebElement Objadd=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[3]/div[1]/input[1]"));
			
		   Objadd.click();
		   
		
		   String Objcompinf=Driver.findElement(By.xpath("html/body/div[2]/div[2]/div[2]/div/h2")).getText();
		   if(Objcompinf.equals("Job : Job Title"))
		   {
			   System.out.println("Job : Job Title is disp ");
		   }
		   else
		   {
			   System.out.println("Job : Job Title is not disp ");
		   }
		
		   WebElement Objjtl=Driver.findElement(By.name("txtJobTitleName"));
			WebElement Objjtdesc=Driver.findElement(By.name("txtJobTitleDesc"));
			WebElement Objjtcomments=Driver.findElement(By.name("txtJobTitleComments"));	
			WebElement Objidd=Driver.findElement(By.name("cmbJobSpecId"));	
			WebElement Objpg=Driver.findElement(By.name("cmbPayGrade"));	
			WebElement Objaddpg=Driver.findElement(By.xpath("//*[@id='frmJobTitle']/div[1]/input[1]"));	
			WebElement Objeditpg=Driver.findElement(By.xpath("//*[@id='frmJobTitle']/div[1]/input[2]"));	
			WebElement Objsave1=Driver.findElement(By.xpath(".//*[@id='frmJobTitle']/div[2]/input[1]"));	
			WebElement Objdelete=Driver.findElement(By.xpath(".//*[@id='frmJobTitle']/div[2]/input[2]"));	
			if(Objjtl.isDisplayed() )
			{
				System.out.println("job title disp");
			}
			if(Objjtdesc.isDisplayed() )
			{
				System.out.println("job title dec disp");
				
			}
		    if(Objjtcomments.isDisplayed())
			{
			    System.out.println("job title comments disp");
			}
			if(Objidd.isDisplayed())
			{
				System.out.println("job spec id disp");
			}
			if(Objpg.isDisplayed() )
			{
				System.out.println("pay grade disp");
			}
			if(Objaddpg.isDisplayed() )
			{
				System.out.println("addpg is disp");
				
			}
		    if(Objeditpg.isDisplayed())
			{
			    System.out.println("edit pg is disp");
			}
			if(Objsave1.isDisplayed())
			{
				System.out.println("add is disp");
			}
			if(Objdelete.isDisplayed())
			{
				System.out.println("delete is  disp");
			}
			
	 
			WebElement saving=Driver.findElement(By.xpath(".//*[@id='frmJobTitle']/div[2]/input[1]"));
			 
			 saving.click();
			
	         
			 
			Alert A1=Driver.switchTo().alert();
						 
			 System.out.println(A1.getText());
			 A1.accept();
	
			 Objjtl.sendKeys("prasanna");
			 
			 saving.click();
			 System.out.println(A1.getText());
			 A1.accept();
	


			 Objjtdesc.sendKeys("prasanna expert in selenium");
			 
			 saving.click();

			 System.out.println("click on save");
 
            WebElement rmpstatus=Driver.findElement(By.xpath(".//*[@id='cmbAssEmploymentStatus']"));
            if(rmpstatus.isDisplayed())
            {
            	System.out.println("emp status is diplayed");
            }
            else
            {
            	System.out.println("emp sattus is not displayed");
            	return;
            }

            WebElement edit=Driver.findElement(By.xpath(".//*[@id='editBtn']"));
            edit.click();
            WebElement clickk=Driver.findElement(By.xpath(".//*[@id='cmbUnAssEmploymentStatus']/option[1]"));
            clickk.click();
            
           WebElement selectt=Driver.findElement(By.xpath("//*[@id='frmJobTitle']/div[1]/input[1]"));
            selectt.click();
              
          WebElement jbs=Driver.findElement(By.xpath(".//*[@id='cmbJobSpecId']"));
          Thread.sleep(2000);
          jbs.sendKeys(" database testings");
           WebElement save3=Driver.findElement(By.xpath(".//*[@id='editBtn']"));
          save3.click();
          WebElement searchby=Driver.findElement(By.xpath("//*[@id='loc_code']"));
          searchby.sendKeys("Name");
          
          WebElement serachfor=Driver.findElement(By.xpath("//*[@id='loc_name']"));
          serachfor.sendKeys("prasanna");
          
          	WebElement sech=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[3]/input[2]"));
          	sech.click();
         
	      
        WebElement verify=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[1]/h2"));
            if(verify.isDisplayed())
            {
            	System.out.println("sucessfully updated");
            	
            }
            else
            {
            	System.out.println("not sucessfully updated");
            	
            }
	 WebElement prasannana=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/table/tbody/tr/td[3]/a"));
	 prasannana.click();
	 WebElement edit1=Driver.findElement(By.xpath(".//*[@id='editBtn']"));
	 edit1.click();
	 
	 WebElement tle=Driver.findElement(By.xpath("//*[@id='txtJobTitleName']"));
	 tle.clear();
	 tle.sendKeys("Badri Akhi");
	 
	 WebElement saved=Driver.findElement(By.xpath(".//*[@id='editBtn']"));
	 		saved.click();
	 		
	 		  WebElement searchby3=Driver.findElement(By.xpath("//*[@id='loc_code']"));
	          searchby3.sendKeys("Name");
	          WebElement serachfor3=Driver.findElement(By.xpath("//*[@id='loc_name']"));
	        
	          serachfor3.sendKeys("Badri Akhi");
	          
	       	WebElement sech1=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[3]/input[2]"));
	          	sech1.click();
	         
	            WebElement verify3=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[1]/h2"));
	       
	            if(verify3.isDisplayed())
	            {
	            	System.out.println("sucessfully updated");
	            	
	            }
	            else
	            {
	            	System.out.println("not sucessfully updated");
	            	
	            }
         
	            
	            
	     	 int rc=Driver.findElements(By.xpath("html/body/div[1]/div[2]/form/table/tbody/tr")).size();
				
			 int i;
			 for(i=2;i<6;i++)
			 {
				 Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/table/tbody/tr["+i+"]/td[1]/input")).click();
			 }
			 WebElement delete=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[3]/div[1]/input[2]"));
			 delete.click();
			 System.out.println(A1.getText());
			 A1.accept();
			 WebElement upd1=Driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/span"));
			 if(upd1.isDisplayed())
			 {
				 System.out.println("upd1 success");
				 
			 }
			 else
			 {
				 System.out.println("upd1 not sucess");
			 }
	            
	            
	            
	            Driver.close();
	            Driver.quit();
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
            
		
	}

}
