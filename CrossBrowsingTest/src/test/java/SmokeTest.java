import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SmokeTest 
{  WebDriver dr;
	@Test
	public void firefoxBrowser()
	{
	
    dr = new FirefoxDriver();
	dr.get("http://www.facebook.com");
	dr.quit();
	}
	
	@Test
	public void chromeBrowser()
	{
	System.setProperty("webdriver.chrome.driver","C:/Users/Md/Desktop/All Zar File");
	dr = new ChromeDriver();
	dr.get("http://www.facebook.com");
	dr.quit();
	}
		
	@Test
	public void ieBrowser()
	{ 
	System.setProperty("webdriver.ie.driver","C:/Users/Md/Desktop/All Zar File");
	dr = new InternetExplorerDriver();
	dr.get("http://www.facebook.com");
	dr.quit();		
			
	}
	
	
	

}
