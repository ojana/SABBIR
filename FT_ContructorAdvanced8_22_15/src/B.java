import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class B
{
	FirefoxDriver dr;
	
	B(FirefoxDriver dr)
	{
	 
	 this.dr = dr;
	
	
	}
	
	void clickSomething()	

	{
	
	dr.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/a")).click();
	
	}	
}
