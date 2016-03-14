import org.openqa.selenium.firefox.FirefoxDriver;


public class Men 
{	
	FirefoxDriver dr;

	Men(FirefoxDriver dr) 
	{
		this.dr=dr;
	}
	
	
	public void verifyTitle()
	{
		System.out.println(dr.getTitle().contains("Men"));
	}
	
	
	
	
	
	
	
	
	
	
	
}
