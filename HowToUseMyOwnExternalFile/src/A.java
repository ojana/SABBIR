import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A 
{	@Test
	public void m2() throws IOException
	{	
		FileInputStream s = new FileInputStream("config.properties");
		
		
		Properties p = new Properties();
		p.load(s);
		
		FirefoxDriver dr = new FirefoxDriver();
		dr.navigate().to(p.getProperty("url"));
		List<WebElement> listofElement = dr.findElements(By.tagName("a"));
		
		for(WebElement moga: listofElement)
		{
			System.out.println(moga.getText());
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
