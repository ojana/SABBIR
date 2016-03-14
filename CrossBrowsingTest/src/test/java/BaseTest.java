import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest
{
    WebDriver dr;
    @Before
    public void start()
    {
     String s = System.getProperty("browser");
     
     if(s.equals("firefox"));
     {   
    	
    	 dr = new FirefoxDriver();
     }
     
     elseif(s.equals("chrome"));
     {   
        	 
    	 dr = new ChromeDriver();
     
     }
	

		
	

	private void elseif(boolean equals) {
		// TODO Auto-generated method stub
		
	}





	@After
	public void end()
	{
		dr.quit();
	}
	
	@Test
	public void mavenTest()
	{
	dr.get("http://www.facebook.com");
	
	}
	
	
	
}
