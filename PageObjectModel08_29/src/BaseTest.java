import java.io.InterruptedIOException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest
{
   FirefoxDriver dr;
   
   @Before
   public void start()
   {
	dr=new FirefoxDriver();
	dr.manage().window().maximize();
	dr.get(https://www.eshopper24.com/)
   }
	@After
	public void end()InterruptedException
	{
	dr.quit();
		
	
		
	}

}
