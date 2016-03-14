import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest
{
	FirefoxDriver dr;
	
	@Before
	public void start()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.bluefly.com/");
		dr.manage().window().maximize();
		dr.navigate().refresh();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
