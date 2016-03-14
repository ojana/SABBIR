import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gift 
{
	FirefoxDriver dr;
	
	Gift(FirefoxDriver dr)
	{
		this.dr = dr;	
	}

	public void verifyTitle()
	{
		System.out.println(dr.getTitle());
	}

	public SmallGoods clickSmallGoods()
	{
		dr.navigate().refresh();
		dr.findElement(By.xpath(".//*[@id='content-area']/div[1]/div/map/area[2]"));
		return new SmallGoods(dr);
	}










}
