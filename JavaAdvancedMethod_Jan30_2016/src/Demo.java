import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo 
{	
	
	
	@Test
	public void screenShot() throws IOException
	{
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://bittechusa.com/");
		
		File fl = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl,new File("C:/Users/Md/Desktop/ScreenShot"+ Math.random()*1000 +".png"),true);
	}

	@Test
	public void rightmouseClick()
	{
		FirefoxDriver dr = new FirefoxDriver();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
