import org.openqa.selenium.firefox.FirefoxDriver;


public class SmallGoods
{

	FirefoxDriver dr;
	



	public SmallGoods(FirefoxDriver dr) 
	{
		this.dr=dr;
	}




	public void verifyTitle()
	{
		System.out.println(dr.getTitle());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
