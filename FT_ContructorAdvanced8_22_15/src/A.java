import org.openqa.selenium.firefox.FirefoxDriver;


public class A
{
   static FirefoxDriver dr = new FirefoxDriver();
   
   public static void main(String[] args) throws InterruptedException
   {
	
	   dr.get("http://www.facebook.com");
	   B x = new B(dr);
	   x.clickSomething();
	   
	
	
	
	
   }



}
