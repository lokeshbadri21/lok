package akkil;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

  public class dropdown 
   {
        public static void main(String[] args)throws Exception 
	 {
        	System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
    		ChromeDriver Driver=new ChromeDriver();
    		//Maximize browser
    		Driver.manage().window().maximize();
    		//--------------------------------------------------
    		//Explicit wait object
    		WebDriverWait wait=new WebDriverWait(Driver, 60);
    		//------------------------------------------------
    		//Open application
    		Driver.get("http://classroom:90/webapp/AgeProb.html");
    		//wait for home page
    		boolean blnRes=wait.until(ExpectedConditions.titleIs("Age Problem"));
    		//Verify Age Problem
    		if(blnRes)
    		{
    			System.out.println("Age Problem displayed");
    		}
    		else
    		{
    			System.out.println("Failed to open Age Problem page");
    		}
    		//Enter age
    		Driver.findElement(By.id("idAge")).sendKeys("10");
    		//Click on submit
    		Driver.findElement(By.id("idSubGo")).click();
    		Thread.sleep(1000);
    		//wait for alert
    		wait.until(ExpectedConditions.alertIsPresent());
    		//Switch to alert
    		Alert A=Driver.switchTo().alert();
    		//Verify alert message as Kid
    		if(A.getText().equals("Kid"))
    		{
    			System.out.println("Kid alert displayed");
    			A.accept();
    		}
    		//------------------------------------------------------
    		Driver.close();
    		Driver.quit();
    	}		
    
		

	}


