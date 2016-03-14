import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Methods
{	
	FirefoxDriver dr = new FirefoxDriver();
	
	void clickOnLogInButton()
	{
		dr.findElement(By.xpath("")).click();
	}
	
	void clickOnAnyElement(By x)
	{
		
		dr.findElement(x).click();
		
	}
	
	void WriteSomething(By t)
	{
		dr.findElement(t).sendKeys("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
