import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;



public class Demo 
{
	FirefoxDriver dr = new FirefoxDriver();
	/*@Test
	public void screenShot()
	{
		dr.get("http://www.");
		dr.manage().window().maximize();
		File sf = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sf,new File("C:\Users\Md\Desktop\OJANA"+Math.random()*1000)+".png");
		
		
		
		
		
	}
	
	@Test
	public void rightmouseclick()
	{
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("https://www.eshopper24.com/");
		dr.manage().window().maximize();
		WebElement ele = dr.findElement(By.xpath(""));
		
		
		
	}*/
	
	@Test
	public void controlKeyboard()
	{
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("https://www.eshopper24.com/");
		dr.manage().window().maximize();
		Keyboard kb = ((HasInputDevices)dr).getKeyboard();
		kb.sendKeys(Keys.F5);
		kb.sendKeys(Keys.CONTROL,Keys.ALT,"p");
		
		
	
	}
	
	@Test 
	public void drugable() throws InterruptedException
	{
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("https://www.eshopper24.com/");
		dr.switchTo().frame(0);
		WebElement dropable = dr.findElement(By.id("draggable"));//source file
		WebElement moga2 = dr.findElement(By.id("droppable"));
		new Actions(dr).dragAndDropBy(dropable,200,10).build().perform();
		new Actions(dr).dragAndDrop(dropable,moga2).build().perform();
		Thread.sleep(3000);		
		
		
		
	}

}
