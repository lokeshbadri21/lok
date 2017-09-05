package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class packageTestNGDataEX 
{
	@Test
	@Parameters("strUN")
	public void parameterTest(String strun)
	{
		System.out.println("parameterized value is:"+strun);
	}
	

}
