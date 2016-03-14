import org.openqa.selenium.By;


public class B {

	public static void main(String[] args)
	{
		A x = new A();
		x.dr.get("https://www.facebook.com/");
		x.click01(By.xpath("//input[@id='email']"), "+8801712582023");
		x.click01(By.xpath("//input[@id='pass']"), "sabbir1992");
		x.click(By.xpath("//input[@id='u_0_x']"));
		x.t();
	}

}
