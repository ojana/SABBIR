import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A 

{
	FirefoxDriver dr = new FirefoxDriver();
	
	void click(By ele)
	{	
		
		
		dr.findElement(ele).click();
	}
	
	void click01(By ele, String s)
	{
		dr.findElement(ele).sendKeys(s);
	}
	
	void t()
	{
		
		boolean s = dr.getTitle().contains("Facebook");
		System.out.println(s);
		
	}
	
	void e()
	{
		dr.findElement(By.xpath("")).isDisplayed();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
