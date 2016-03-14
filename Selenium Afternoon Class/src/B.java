import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class B 
{
	FirefoxDriver dr = new FirefoxDriver();
	
	void click()
	{
		
		dr.findElement(By.xpath("//*[@id='u_0_x']")).click();	
		
	}
	
		
	void type()
	{
		dr.findElement(By.xpath("g")).sendKeys(h);
	}

	


	
	
	
	
	
	
	
	
	
	
	
	
	
}
