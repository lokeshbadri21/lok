package akkil;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
public class actionclas 
{
	public static void main(String[] args)throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Brow=new ChromeDriver();
		Brow.get("http://classroom:90/qahrm");
		Brow.manage().window().maximize();
		Thread.sleep(2000);
		Brow.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		Brow.findElement(By.name("txtPassword")).sendKeys("user1");
		Brow.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		//-----------------------------------------------------------
		//Create object for action class
		Actions A=new Actions(Brow);
		WebElement E=Brow.findElement(By.id("admin"));
		A.moveToElement(E).perform();
		A.moveToElement(Brow.findElement(By.linkText("Company Info"))).perform();
		A.moveToElement(Brow.findElement(By.linkText("Job"))).perform();
		A.moveToElement(Brow.findElement(By.linkText("Qualification"))).perform();
		A.moveToElement(Brow.findElement(By.linkText("Skills"))).perform();
		
		A.moveToElement(Brow.findElement(By.xpath(".//*[@id='admin']/ul/li[4]/ul/li[1]/a/span"))).click().perform();
		//Move to PIM/Mouse over on PIM
		//WebElement PIM=Brow.findElement(By.id("pim"));
		//Mouse over on PIM
		//A.moveToElement(PIM).perform();
		Thread.sleep(4000);
		Brow.findElement(By.linkText("Add Employee")).click();
		//*****************************************************************
		Thread.sleep(2000);
		Brow.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		Brow.close();
		Brow.quit();
		//=============================================================
		}

}
