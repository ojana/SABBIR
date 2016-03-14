import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Support 
{
	FirefoxDriver driver;
	Share sh; // (Here we creating global variable in order to use this variable in different different method,,,And the data type of the sh variable is Class type that is Share Class.
	Support(FirefoxDriver driver)
	{
		this.driver = driver;
	}
	
	void clickProduct() throws InterruptedException
	{
	 	sh = new Share(driver);
		sh.click(driver.findElement(By.xpath("//[@id='main-nav-shoes']/a")));
		Thread.sleep(1000);
		sh.click(driver.findElement(By.xpath("//[@id='slotMcolMain1']/div/div[2]/ul/li[2]/a/div/img")));
		Thread.sleep(1000);
		sh.click(driver.findElement(By.xpath("//[@id='376849701']/div[1]/a/img")));
		
		
	}
	
	void addToBag() throws InterruptedException
	{
		sh = new Share(driver);
		Thread.sleep(1000);
		sh.click(driver.findElement(By.xpath("//[@id='product']/div[6]/span[2]")));
		Thread.sleep(1000);
		sh.click(driver.findElement(By.xpath("//[@id='product']/div[7]/span/span[2]")));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
