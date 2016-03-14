import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class B 
{
	static FirefoxDriver dr = new FirefoxDriver();
	static void p() 
	{
		System.out.println("slaks");
	}
	public static void main(String[]args)
	
	{	p();
		A x = new A(dr);
		x.m1();
		C x1 = new C(dr);
		x1.m2(By.xpath("//input[@id='email']"), "+8801712582023");
		x1.m2(By.xpath("//input[@id='pass']"), "sabbir1992");
		x1.m3();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
