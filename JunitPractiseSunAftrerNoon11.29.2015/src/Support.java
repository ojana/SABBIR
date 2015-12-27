import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Support
{	
	//FirefoxDriver dr;
	
	@Before
	public void start() throws InterruptedException
	{	
		//dr = new FirefoxDriver();
		//Thread.sleep(5000);
		System.out.println("This is Before Method");
		//dr.manage().window().maximize();
	}
	
	@After
	public void end() throws InterruptedException
	{	//Thread.sleep(5000);
		//dr.quit();
		System.out.println("This is After Method");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("This is BeforeClass Method");	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("This is AfterClassMethod");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
