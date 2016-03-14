import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Support 
{
	FirefoxDriver dr;
	
	@ Before
	public void start() throws InterruptedException
	{
		dr= new FirefoxDriver();
		dr.get("http://www.bluefly.com/");
		Thread.sleep(2000);
		dr.navigate().refresh();
		
		
	}
	
	
	@ After 
	public void end() throws InterruptedException
	{	
		Thread.sleep(3000);
		dr.quit();
	}
	
	
	
	
	
	
	
	
}
