import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class A 
{
	FirefoxDriver dr = new FirefoxDriver();
	
	@Test
	public void m1() throws InterruptedException
	{
		dr.get("http://www.target.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.navigate().refresh();
		int s = dr.findElements(By.xpath(".//*[@id='MainMenu']/li/span/a")).size();
		
		for(int i=1;i<=s;i++)
		{
			WebElement ele=dr.findElement(By.xpath(".//*[@id='MainMenu']/li["+i+"]/span/a"));
			Thread.sleep(2000);
			Actions a=new Actions(dr);
			a.moveToElement(ele).perform();
			
			int s1=dr.findElements(By.xpath(".//*[@id='MainMenu']/li[1]/div/div/ul[1]/li[2]/ul/li[1]/a")).size();
			for(int j=1;j<=s1;j++)
			{
				WebElement ele1=dr.findElement(By.xpath(".//*[@id='MainMenu']/li["+i+"]/span/a"));
				Thread.sleep(2000);
				Actions a1=new Actions(dr);
				a1.moveToElement(ele1).perform();
				Thread.sleep(3000);
				dr.findElement(By.xpath(".//*[@id='MainMenu']/li["+i+"]/div/div/ul[1]/li[2]/ul/li["+j+"]/a")).click();
				Thread.sleep(3000);
				dr.navigate().back();
				Thread.sleep(3000);
				
					
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
