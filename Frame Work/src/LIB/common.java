package LIB;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class common 
{
	WebDriver driver;
	Actions action;
	public void startBrowserChrome()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://apps.qaplanet.in/qahrm/login.php");
	}
	public void maximiseBrowser()
	{
		driver.manage().window().maximize();
		
	}
	public WebElement WebElementId(String identifier,String locator)
	{
		WebElement e=null;
		switch (identifier)
		{
		case "id" : 
			e=driver.findElement(By.id(locator));
		              	break;
		case "className" : 
			e=driver.findElement(By.className(locator));
					  	break;
		case "tagName" : 
			e=driver.findElement(By.tagName(locator));
						break;
		case "name" : 
			e=driver.findElement(By.name(locator));
						break;		 
		case "linkText" : 
			e=driver.findElement(By.linkText(locator));
						break;		 
		case "partialLinkText" : 
			e=driver.findElement(By.partialLinkText(locator));
						break;          
		case "cssSelector" : 
			e=driver.findElement(By.cssSelector(locator));
						break;
		case "xpath" :
			e=driver.findElement(By.xpath(locator));
						break;
		default : 
			System.out.println("Locator not found");
       	 			e=null;
		}
		return e;
	}
	public void sendkeys(String identifier,String locator,String content)
	{
		WebElement e=WebElementId(identifier,locator);
				e.sendKeys(content);
	}
	public void Cleartextfield(String identifier,String locator)
	{
		WebElement e=WebElementId(identifier,locator);
				e.clear();
	}
	public void click(String identifier,String locator)
	{
		WebElement e=WebElementId(identifier,locator);
				e.click();
	}
    public void verifytitle(String title)
    {
    	if(driver.getTitle().equals(title))
    	{
    		System.out.println(title+" displayed");
    	}
    	else
    	{
    		System.out.println("Failed to display "+title);
    	}
    }
    public void waitUntilElementPresent(String elementpath)
    {
    	WebElement elementpresent=(new WebDriverWait(driver,10)).
    			until(ExpectedConditions.presenceOfElementLocated
    					(By.xpath(elementpath)));
		
    		}
	
    public void verifyText(String identifier,String locator,String text)
	{
		WebElement e=WebElementId(identifier, locator);
		if (e.getText().equals(text))
		{
			System.out.println(text+" displayed");
		}
		else
		{
			System.out.println(text+"Did not displayed");
	
		}
	}
	//verify element present
	public void verifyElementPresent(String identifier,String locator)
	{
		WebElement e=WebElementId(identifier, locator);
		if (e.isDisplayed())
		{
			System.out.println("Element present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
	public void sleepThread() {
		
	} public void sleepThread(long sleeptime)
	{
		try{
			Thread.sleep(sleeptime);
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void WaitForPageToLoad()
	{
		int i;
		try 
		{
		 for(i=0;i<50;i++)
		 {
			 if(driver.getTitle().length()!=0)
			 {
				 System.out.println("page loaded");
				 i=51;
				 break;
			 }
			 else
			 {
				 Thread.sleep(1000);
			 }
		 }
		}
		catch(Exception e)
		{
			
		System.out.println(e);
	}
}
	public void selectFrameById(String locator)
	{
		driver.switchTo().frame(locator);
	}
	//Select frame default method   
	public void selectFrameDefault(){
		driver.switchTo().defaultContent();
	}
	
	//getting data from table and verifying it with the required text  
	public void verifyElementInTable(String xpathlocator,String text)
	{
		boolean a=false;
		List<WebElement> tdlist = driver.findElements(By.xpath(xpathlocator));
		for(WebElement el: tdlist)  
		{
			if (el.getText().equals(text))
			{		
				a=true;	
				break;
			}
		}
		
		if(a==true)
		{
			System.out.println(text+" was identifed");				
		}
		else
		{
			System.out.println( text+" was not identifed");
		}
	}
	public void select(String identifier,String locator,String text)
	{
		WebElement e=WebElementId(identifier, locator);
		
		Select sel=new Select(e);
		
		sel.selectByVisibleText(text);
		
	}
	
	
	
	
	
	
	//Start action
	public void startAction()
	{
		action =new Actions(driver);
	}
	//move to element
	public void MouseOverToElement(String identifier,String locator)
	{		
		WebElement e=WebElementId(identifier, locator);
		action.moveToElement(e).perform();
	}
	public void alert()
	{
		 Alert al=driver.switchTo().alert();
	al.accept();
	}
	
	//close 
	public void closeBrowser()
	{
		driver.close();
	}
	//Quit
	public void QuitObject()
	{
		driver.quit();
	}
	}
	
	


