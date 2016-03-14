import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BlueflyLoop
{
   FirefoxDriver dr = new FirefoxDriver();
   
   @Test
   public void loop() throws InterruptedException
   {
	dr.get("http://www.bluefly.com");
	dr.manage().window().maximize();
	dr.manage().timeouts().implictlyWait(20. TimeUnit.SECONDS);
	
	
	
	
	
   }
	
	
	
	
	
   
   
   
   
	
	
	
	
}