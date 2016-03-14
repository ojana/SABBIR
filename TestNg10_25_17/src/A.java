import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class A
{
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
	
	@BeforeMethod
	
	public void m1()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void m2()
	{
		System.out.println("After method");
	}
	
	@BeforeClass
	public void m3()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void m4()
	{
		System.out.println("After class");
	}
	
	@BeforeTest
	public void m5()
	{
		System.out.println("before test");
	}
	
	@AfterTest
	public void m6()
	{
		System.out.println("After Test");
	}
	
	
	
}
