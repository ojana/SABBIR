import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Share 
{	
	FirefoxDriver driver;
	
	Share(FirefoxDriver driver)
	{
		 this.driver = driver;
	}
	
	

	void click(WebElement ele)
	{
		ele.click();
	}
	
	void verifytittle(String x)
	{
		driver.getTitle().contains(x);
		driver.getTitle();
		
	}



	
	
	
	
	
	
	
}        
