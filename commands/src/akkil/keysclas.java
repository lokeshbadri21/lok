package akkil;

import org.openqa.jetty.html.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class keysclas  
 {
	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Brow=new ChromeDriver();
		//FirefoxDriver Driver=new FirefoxDriver();
		Brow.get("http://apps.qaplanet.in/qahrm/login.php");
		Thread.sleep(2000);
		WebElement objUn=Brow.findElement(By.name("txtUserName"));
		objUn.sendKeys("admin");
		objUn.click();
		objUn.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);
		objUn.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		objUn.sendKeys("qaplanet1");
		Thread.sleep(2000);
		WebElement objp=Brow.findElement(By.name("txtPassword"));
		objp.sendKeys("user1");
		Thread.sleep(2000);
		objp.click();
		WebElement objs=Brow.findElement(By.name("Submit"));
		objs.click();
	
		
	}

}
