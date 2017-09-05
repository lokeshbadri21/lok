package akkil;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class draganddown 
{
	public static void main(String[] args)throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "F:\\D-Drive\\FromC\\geckodriver-v0.11.1-win64\\geckodriver.exe");
//		//create object for a class, it will launch browser
//		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 30);
	Actions act=new Actions(driver);
		//*************************************************
		String URL="http://jqueryui.com/droppable/";
		driver.get(URL);
		wait.until(ExpectedConditions.titleIs("JavaScript Tree Menu - Ajax TreeView - dhtmlxTree"));
		Thread.sleep(6000);
		//Take xpath of Thriller from first box
		WebElement from=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[1]")));
		//Take xpath of Horror from Second box
		WebElement to=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[2]")));
//Way 1
		
		//act.clickAndHold(from).perform();
		//act.moveToElement(to).perform();
		//act.click(to).perform();
//Way 2
		
	/* Actions dragdrop= act.clickAndHold(from)                                                                          
		.moveToElement(to)
		.click(to)
		.build();
		dragdrop.perform();*/
		
//Way 3
		
		act.dragAndDrop(from, to).build().perform();
		
		Thread.sleep(6000);
	driver.close();
	driver.quit();
	}

	
	

}
