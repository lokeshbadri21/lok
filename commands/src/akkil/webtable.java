package akkil;



import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webtable 
{
	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Brow=new ChromeDriver();
		Brow.get("http://classroom:90/webapp/AssertXpath.html");
		WebDriverWait wait=new WebDriverWait(Brow, 30);
		if(wait.until(ExpectedConditions.titleIs("AssertXPath")))
		{
			System.out.println("ass x disp");
		}
		int rc=Brow.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
		System.out.println(rc);
		int colc=Brow.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
		System.out.println(colc);
		int cc=Brow.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td")).size();
		System.out.println(cc);
	/*	int i,j;
		for(i=1;i<=rc;i++)
		{
			for(j=1;j<colc;j++)
			{ 
				String text=Brow.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				
				
				
						System.out.println(text);  */
						
			List<WebElement> TDS=Brow.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td"));
			System.out.println(TDS.size());
	/*
			Iterator<WebElement> IT=TDS.iterator();
			while(IT.hasNext());
			{
				WebElement TD=IT.next();
				System.out.println(TD.getText());   */
		
			for(WebElement TD:TDS)
			{
				System.out.println(TD.getText());
		
			}
			
		
	
	}
	
       
         

}
