import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CLickProduct
{	
	
	@Test
	public void m1()  
	{
		
		FirefoxDriver dr = new FirefoxDriver();
		
		dr.get("https://www.eshopper24.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a/b")).click();
		//Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)dr;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		//Thread.sleep(2000);
		
		int s = dr.findElements(By.xpath("")).size();
		for(int i = 1;i<=s;i++)
		{
			dr.findElement(By.xpath("")).click();
			dr.navigate().back();
			//Thread.sleep(2000);
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
