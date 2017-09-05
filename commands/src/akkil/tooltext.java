package akkil;

import java.security.KeyStore.Entry.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltext 
{
	public static void main(String[] args) 
	{
		  
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver lok=new ChromeDriver();
		lok.get("https://www.google.co.in/?gfe_rd=cr&ei=-XWRWdHsLsuL8QeSpraACg");
		
		lok.manage().window().maximize();
		
		String ToolTip=lok.findElement(By.id("lst-ib")).getAttribute("title"); 
	 System.out.println(ToolTip);
	
	
	}

}
