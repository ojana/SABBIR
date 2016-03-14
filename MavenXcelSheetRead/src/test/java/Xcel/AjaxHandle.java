package Xcel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxHandle 
	
{
	FirefoxDriver dr;
	
	@Test
	public void run()
	{
		expectedCondition(By.id("u_0_y"));
	}
	
	public void expectedCondition(By by)
	{
		dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");
		
		WebDriverWait wait = new WebDriverWait(dr, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
		
	}
	
	
	
	
	
	
	
}
