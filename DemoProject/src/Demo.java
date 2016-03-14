import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo
{

	@Test
	public void getAllLink()
	{
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("https://www.facebook.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select s = new Select(dr.findElement(By.id("month")));
		//s.selectByVisibleText("Jan");
		int size = s.getOptions().size();
		Select si = new Select(dr.findElement(By.id("year")));
		int s1 = s.getOptions().size();
		System.out.println(size);
		
		for(int i=size-1;i>=0;i--)
		{
			
			si.selectByIndex(i);
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
