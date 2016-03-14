package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class ParallalTest 
{
	WebDriver dr;
	
	static Logger log = Logger.getLogger(ParallalTest.class);
	
	@Parameters("browser")
	@Test
	public void abc(String s)
	{
		if(s.equals("firefox"))
		{
			dr = new FirefoxDriver();
			
		}
		else if(s.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md\\Desktop\\All Zar File\\chromedriver.exe");
			dr = new ChromeDriver();
			
		}
		
		
		
		
		
		
		
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
}
