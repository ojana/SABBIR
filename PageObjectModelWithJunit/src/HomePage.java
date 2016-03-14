import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomePage 
{
	FirefoxDriver dr;
	HomePage(FirefoxDriver dr)
	{
		this.dr = dr;
	}
	
	public void verifyTitle()
	{
		System.out.println(dr.getTitle());
	}
	
	public Gift clickGift()
	{
		dr.findElement(By.xpath(".//*[@id='main-nav-gifts']/a")).click();
		return new Gift(dr);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
