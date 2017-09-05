package akkil;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddddd 
{
	public static void main(String[] args)throws Exception
	
	{

		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://classroom:90/webapp/SelectAWebsite.html");
		Thread.sleep(4000);
		WebElement E=driver.findElement(By.name("OptWeb"));
		Select s=new Select(E);
		//s.selectByVisibleText("QAPlanet1");
        //s.selectByValue("Yahoo");
        //driver.findElement(By.name("btnGo")).click();
       List<WebElement> Ops=s.getOptions() ;
       Iterator<WebElement> it=Ops.iterator();
       while(it.hasNext())
       {
    	   WebElement E1=it.next();
    	   System.out.println(E1.getText());
       }
		
       s.deselectAll();
        Thread.sleep(3000);
	
		
		
	}

}
