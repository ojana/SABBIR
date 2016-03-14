import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Nest 
{
	FirefoxDriver dr = new FirefoxDriver();
	
	@Test
	public void nest() throws InterruptedException
	{
		dr.get("http://www.bluefly.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.navigate().refresh();
		
		int msize = dr.findElements(By.xpath(".//*[@id='main-nav-list']")).size();
		
		for(int i=1;i<=msize;i++)
		{
			int subsize=dr.findElements(By.xpath("")).size();
			for(int j=1;j<=subsize;j++)
			{
				Thread.sleep(2000);
				WebElement ele = dr.findElement(By.xpath(""));
				Actions a = new Actions(dr);
				a.moveToElement(ele).perform();
				Thread.sleep(2000);
				dr.findElement(By.xpath("")).click();
				Thread.sleep(2000);
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
