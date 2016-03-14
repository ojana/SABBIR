package testNG100315;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo 
{
	@BeforeSuite
	public void m1()
	{
		
		System.out.println("b suite");
		
	}
	
	@BeforeTest
	public void m2()
	{
		
		System.out.println("b test");
		
	}
	
	@BeforeClass
	public void m3()
	{
		
		System.out.println("b class");
		
	}
	@BeforeMethod
	public void m4()
	{
		
		System.out.println("b method");
		
	}
	
	@AfterSuite
	public void m5()
	{
		
		System.out.println("A suite");
		
	}
	
	@AfterTest
	public void m6()
	{
		
		System.out.println("A test");
		
	}
	
	@AfterClass
	public void m7()
	{
		
		System.out.println("A class");
		
	}
	@AfterMethod
	public void m8()
	{
		
		System.out.println("A method");
		
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
}
