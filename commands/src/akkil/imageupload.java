package akkil;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class imageupload 
{
	public static void main(String[] args)throws Exception
	{
		    System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver Driver=new ChromeDriver();
			Driver.get("http://apps.qaplanet.in/qahrm/login.php");
			Driver.manage().window().maximize();
			Thread.sleep(2000);
			Driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
			Driver.findElement(By.name("txtPassword")).sendKeys("user1");
			Driver.findElement(By.name("Submit")).click();
			Thread.sleep(2000);
			//-----------------------------------------------------------
			//Create object for action class
			Actions A=new Actions(Driver);
			WebElement Objaddemp=Driver.findElement(By.linkText("PIM"));
			A.moveToElement(Objaddemp).perform();
			A.moveToElement(Driver.findElement(By.linkText("Employee List"))).perform();
			
			A.moveToElement(Driver.findElement(By.linkText("Add Employee"))).click().perform();
			Driver.switchTo().frame("rightMenu");
			
			
		
		

			Thread.sleep(2000);
             
			Robot rt=new Robot();
			WebElement objBrowse=Driver.findElement(By.name("photofile"));
			objBrowse.click();
			StringSelection ss=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			rt.delay(2000);
			rt.keyPress(KeyEvent.VK_CONTROL);
			rt.keyPress(KeyEvent.VK_V);
			rt.keyRelease(KeyEvent.VK_V);
			rt.keyRelease(KeyEvent.VK_CONTROL);
			rt.delay(1000);
			rt.keyPress(KeyEvent.VK_ENTER);
			rt.keyRelease(KeyEvent.VK_ENTER );
			
			
			
	
	
	
	}
}
