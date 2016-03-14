import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest  
{
	WebDriver dr;
	
	@Before
	public void start()
	{
	
		if(System.getProperty("browser").equals("firefox"))
		{
		dr=new FirefoxDriver();
			
			
			
		}
		
		else if(System.getProperty("browser").equals("chrome"))
		{	
			System.setProperty("webdriver.chrome.driver", "C:/Users/Md/Desktop/All Zar File/chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("https://www.chase.com/");
			
			
			
		}
		
		else if(System.getProperty("browser").equals("ie"))                                                                                                                                                               
		{
			System.setProperty("webdriver.ie.driver", "C:/Users/Md/Desktop/All Zar File/IEDriverServer.exe");
			dr=new InternetExplorerDriver();
		}
		
	}	
		
	@Test	
	public void end()	
	{
		dr.quit();
	}
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
