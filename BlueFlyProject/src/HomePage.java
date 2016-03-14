import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;



public class HomePage extends LoadableComponent <HomePage>

{
	FirefoxDriver dr;
	
	@FindBy(how = How.XPATH, using="//a[@class='main-nav-link-men main-nav-link")WebElement themenlink;
	
	
	HomePage(FirefoxDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);//Here this means HomePage Class	
		
	}
	
	
	public void verifyTitle()
	
	{
		System.out.println(dr.getCurrentUrl());
	}
	
	
	public Men clickMen()
	
	{
		themenlink.click();
		return new Men(dr);
	}

	
	@SuppressWarnings("deprecation")
	@Override
	protected void isLoaded() throws Error //If it true means it goes to menlink it will print True; If false it False it will execute the load Method
	{
		Assert.assertTrue(dr.getCurrentUrl().equals("http://www.bluefly.com/a/men-clothing-shoes-accessories"));
	}


	@Override
	protected void load()
	{
		dr.get("http://www.bluefly.com/a/men-clothing-shoes-accessories");
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
