package test;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc2 {


		@BeforeTest
	public void main1()
	{
			System.out.println("main1.1");
	}
		@AfterTest
		public void main2()
		{
				System.out.println("main2.2");
		}
		
		@Test(priority=2)
		public void main3()
		{
				System.out.println("main3.3");
				Reporter.log("main3.3");
		}
		
		@Test(priority=1)
		public void main4()
		{
				System.out.println("main4.4");
				Reporter.log("main4.4");
		}
	}

