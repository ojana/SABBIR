import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ProductSelection 
{
	public static void main(String[]args)
	{
		FirefoxDriver dr = new FirefoxDriver();
		
		dr.get("https://www.eshopper24.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a")).click();
		dr.findElement(By.xpath(""));
		
	    
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
