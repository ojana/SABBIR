import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A 
{
	FirefoxDriver dr = new FirefoxDriver();
	
	@Test
	public void m1()
	{
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		
	    List<WebElement> list=dr.findElements(By.tagName("a"));
	    
	    for(WebElement ele:list)//Here list is Array Type of variable & it will get text one by one
	    {
	    	
	    	System.out.println(ele.getText());
	    	
	    	
	    }
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
