import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class C 
{
	FirefoxDriver dr;
	
	void m2(By s, CharSequence t)
	{
		dr.findElement(s).sendKeys(t);
		
	}
	
	C(FirefoxDriver dr2)
	{
		dr = dr2;
	}
	
	void m3()
	{
		dr.findElement(By.xpath("//input[@id='u_0_x']")).click();
	}
	
	
	
	
	
	
	
}
