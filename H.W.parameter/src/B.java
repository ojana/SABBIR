import org.openqa.selenium.By;


public class B
{

	public static void main(String[] args) 
	{
		Methods x = new Methods();
		x.dr.get("http://www.facebook.com");
		x.dr.manage().window();
		
		//x.clickOnLogInButton();
		x.clickOnAnyElement(By.xpath(".//*[@id='u_0_x']"));
		x.clickOnAnyElement(By.xpath(""));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
