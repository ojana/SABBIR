import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

/**
 * 
 */

/**
 * @author Md
 *
 */
  public class SeleniumHistory
  {
   
  @Test
	  
   public static void main(String[]args) 
  {

	
  //WebDriver way to open browser
  //FirefoxDriver driver1 = new FirefoxDriver();


  Selenium Remote Control way (RC)

  Before running the project start the server manually
  1:open command prompt (cmd)
  2:got to file level where slenium server is saved in your computer 
  Ex: cd downloads
  3:java -jar"selenium-server-standalone-2.47.1"
  
  
  /*DefaultSelenium driver = new 
      DefaultSelenium("localhost",4444,"firefox", "https://www.facebook.com");
   driver.start();
   driver.open("/");
   driver.type("email","asad";
   driver.click("//input[@type='submit']"};   
  */
  
  }
  FirefoxDriver dr = new FirefoxDiver();
  WebDriverBackedSelenium rc = new WebDriverBackedSelenium(dr,"https://www.facebook.com");
  dr.get("https://www.facebook.com/");
  rc.type("email","Asad");
  
  
  rc.type("pass","abc@gmail.com");
  dr.quit();
  //WebDriver.findelement(By name("email")).sendkeys("abc@gmail.com") 
  
  
  
  
  
  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  




	
	
	
	
	
   }	
	
	
	
	
	
	
	
	
	
	
	
}
