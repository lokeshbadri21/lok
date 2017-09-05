package akkil;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebook {

	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Driver= new ChromeDriver();
		Driver.get("https://www.facebook.com/?stype=lo&jlou=Afd_qmQdIaiMmZPibTUt_M1zUtZ-il63TgUfKMbHYVPCxZwbrOYY84Stk4r1P_ub1C1LQGj2CQ7fGQ0nYg2ZjGj0waI00gEhD5XV2VlsCbnIHg&smuh=17363&lh=Ac-XYPXvRlgS5eyF");
		Driver.manage().window().maximize();
	WebDriverWait Wait=new WebDriverWait(Driver, 40);
	WebElement ObjUn=Driver.findElement(By.name("email"));
	WebElement Objpd=Driver.findElement(By.name("pass"));
	   
	   ObjUn.sendKeys("lokeshbadri21@gmail.com");
	   Objpd.sendKeys("");
	  
	  WebElement login=Driver.findElement(By.xpath("//*[@id='u_0_0']"));
	  login.click();
	  
	  Thread.sleep(1000);
	  
	            Robot rb=new Robot();
	            rb.keyPress(KeyEvent.VK_TAB);
	            rb.delay(1000);
	            rb.keyPress(KeyEvent.VK_ENTER);
	         
	            
	  
	  
	
	  WebElement chating=Driver.findElement(By.xpath("//*[@id='u_0_9']/div[1]/div[1]/div/a"));
	  chating.click();
	  
	
	  Thread.sleep(2000);
	  
	  WebElement sc=Driver.findElement(By.xpath("//input[@name='q']"));  
	  sc.sendKeys("Jhanvi Pullela");
	  Driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  WebElement jhan=Driver.findElement(By.linkText("Jhanvi Pullela"));
	  jhan.click();
	  
	  WebElement msg=Driver.findElement(By.linkText("Message"));
	  msg.click();
	 
	  Thread.sleep(2000);
	  WebElement msgs=Driver.findElement(By.cssSelector("div._552h"));
	
	  Thread.sleep(2000);
	 
	  msgs.sendKeys("hi");

	  
	  
	  
	  //  JavascriptExecutor lok=(JavascriptExecutor).driver;
	 // String lok="document.getElementByName("_1mf _1mj")
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	}

}
