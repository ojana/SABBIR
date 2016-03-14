import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Bsaetest
{ 
	
  static FirefoxDriver dr;	
  @BeforeClass 
  public static void start()
   {
	dr=new FirefoxDriver();
	dr.get("http://www.facebook.com");	
   }

  @AfterClass
  public static void end()
  {
	dr.quit();
  }
	
}
