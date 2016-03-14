import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class Alert 
{
	FirefoxDriver dr = new FirefoxDriver();	
	@Test
	public void m1() throws InterruptedException
	{	
		dr.get("file:///C:/Users/Md/Desktop/couple/HTMLALERT.html");
		dr.findElementByXPath("//input[@value='login']").click();
		Thread.sleep(5000);
		//Alert a = new Alert();
		org.openqa.selenium.Alert a1 = dr.switchTo().alert();
		a1.accept();
		Thread.sleep(5000);
		
		dr.findElementByXPath("//input[@value='login1']").click();
		Thread.sleep(5000);
		a1.dismiss();
		
		dr.findElementByXPath("//input[@value='login2']").click();
		Thread.sleep(5000);
		String s=a1.getText();
		if(s.equals("hi,this is prompt box"))
		{
			System.out.println("Present");
		}
		
		else
		System.out.println("Not");
		a1.sendKeys("slaks");
		Thread.sleep(5000);
		a1.accept();
		Thread.sleep(5000);
			
	}
	
	@Test
	public void dragAndDrop() throws InterruptedException
	{
		dr.get("http://jqueryui.com/droppable/");
		Thread.sleep(2000);
		dr.manage().window().maximize();
		dr.switchTo().frame(0);
		WebElement drag = dr.findElementByXPath(".//*[@id='draggable']");
		//WebElement drop = dr.findElementByXPath(".//*[@id='droppable']");
		Actions a = new Actions(dr);
		Thread.sleep(4000);
		//a.dragAndDrop(drag,drop).build().perform();
		a.dragAndDropBy(drag, 140, 20).build().perform();
		Thread.sleep(5000);
		dr.quit();
		
		
	}
	
	@Test
	public void OldFirefox() throws Throwable  
	{	
		File f = new File("C:\\Users\\Md\\Downloads\\firebug-2.0.xpi");
		File f1 = new File("C:\\Users\\Md\\Downloads\\firepath-0.9.7-fx.xpi");
		FirefoxProfile profile = new FirefoxProfile();
		FirefoxBinary fbinary = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
		FirefoxDriver x = new FirefoxDriver(fbinary,profile);
		profile.addExtension(f);
		x.get("https://www.facebook.com/");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
