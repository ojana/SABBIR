import org.openqa.selenium.firefox.FirefoxDriver;


public class Test 
{
	static FirefoxDriver dr = new FirefoxDriver();
	static Share sh;
	public static void main(String[]args) throws InterruptedException
	{
		sh = new Share(dr);
		Support sp = new Support(dr);
		
		dr.get("http://www.bluefly.com/");
		Thread.sleep(2000);
		dr.manage().window().maximize();
		sh.verifytittle("BLUEFLY");
		sp.clickProduct();
		sp.addToBag();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
