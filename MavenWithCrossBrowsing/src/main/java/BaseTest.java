import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest
{
  WebDriver dr;
  @Before
  public void start()
  {
	  /*System.setProperty("webdriver.chrome.driver","C:/Users/Md/Desktop/All Zar File/chromedriver/exe");
	  dr=new ChromeDriver();
	  dr.get("http://www.facebook.com");*/
	  System.setProperty("webdriver.ie.driver","C:/Users/Md/Desktop/All Zar File/ie/exe");
	  dr=new InternetExplorerDriver();
	  dr.get("http://www.facebook.com");
	    
  }
  
  
  
 
	
	
	
	
	
	
	
	
	
}
