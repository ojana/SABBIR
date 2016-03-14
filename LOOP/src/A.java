

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;



public class A
{
		
		@Test
		public void m1() throws InterruptedException  
		{
			
			FirefoxDriver dr = new FirefoxDriver();
			
			dr.get("http://www.bluefly.com/");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			dr.findElement(By.xpath(".//*[@id='main-nav-woman']/a")).click();
			Thread.sleep(2000);
			
			JavascriptExecutor jse = (JavascriptExecutor)dr;
			jse.executeScript("window.scrollBy(0,250)", "");
			
			Thread.sleep(2000);
			
			int s = dr.findElements(By.xpath("")).size();
			for(int i = 1;i<=s;i++)
			{
				dr.findElement(By.xpath("")).click();
				dr.navigate().back();
				Thread.sleep(2000);
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
		}
		
		
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

