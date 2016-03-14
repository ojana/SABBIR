import org.junit.Test;
import org.openqa.selenium.By;


public class SmokeTest extends Bsaetest
{

	  
	  @Test
	  public void login() throws InterruptedException
	  {
	     dr.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")).sendKeys("+8801675576348");
	     dr.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("facebook1992");
	     Thread.sleep(5000);
	     dr.findElement(By.xpath("//input[@id='u_0_x']")).click();
		 Thread.sleep(5000);
	  
	  }  
	  
	  
	@Test
	  public void logout()				
	  {
		dr.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		dr.findElement(By.xpath(".//*[@id='u_e_1']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();
	  }
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
