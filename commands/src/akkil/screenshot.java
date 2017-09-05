package akkil;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot 
 {
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver lok=new ChromeDriver();
		lok.get("http://apps.qaplanet.in/qahrm/login.php");
		lok.manage().window().maximize();
	
		
		
		File srcFile=((TakesScreenshot)lok).getScreenshotAs(OutputType.FILE);
	
	
		FileUtils.copyFile(srcFile, new File("D:\\Screenshot.png"));
		
		
	}

}
