import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser 
{
	
	
	

	public static void main(String[]args) throws InterruptedException
	
	{
		FirefoxDriver dr = new FirefoxDriver();
		Thread.sleep(4000);
	    dr.get("http://www.facebook.com");
	    dr.findElementByXPath(".//*[@id='u_0_1']").sendKeys("Mahdi");
	    dr.findElementByXPath(".//*[@id='u_0_1']").sendKeys("Fahad");
	    Thread.sleep(4000);
		dr.quit();
	
	
	
	
	
	}

	
	
}
