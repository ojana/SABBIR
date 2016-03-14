package com.bit.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DemoTest 
{
	WebDriver dr;
	
	@Test
	@Parameters("b")
	public void m2(String b)
	{
		System.out.println("Hi Polapains");
		if(b.equals("F"))
		{
			dr = new FirefoxDriver();
			
		}
		else if(b.equals("C"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/Md/Desktop/All Zar File/chromedriver.exe");
			dr = new ChromeDriver();
		}
	}
	
	
	
	
	
	
	
	@DataProvider(name="computer")
	public Object[][] credential()
	{
		return new Object[][]{{"bittechusa@yahoo.com","122334gdy"},{"bittechusa@gmail.com","gfach253"},
				{"sabbir@gmail.com","password"}};
	}
	@Test(dataProvider="computer")
	public void abcd(String email, String pass) throws InterruptedException
	{
		dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		dr.findElement(By.id("email")).sendKeys(email);
		dr.findElement(By.id("pass")).sendKeys(pass);
		dr.findElement(By.id("u_0_x")).click();
		
		Thread.sleep(3000);
		dr.quit();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
