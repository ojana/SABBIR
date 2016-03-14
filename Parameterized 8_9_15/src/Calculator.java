import org.openqa.selenium.firefox.FirefoxDriver;


public class Calculator 
{
	int a;
	void add(int b, int c)
	{
		System.out.println(b+c);
	}
 
	void sub(int d, int e)
	{
		System.out.println(d-e);
	}
	void div ()
	{
 
	}	
	void multipication()
	{
	
	}
	void name(String firstName, String lastName)
	{
		System.out.println(firstName + "\n" + lastName);
	}
	void something(String x, int p)
	{
		System.out.println(x+" "+p);
	}	
	FirefoxDriver dr = new FirefoxDriver();
	void get(String url)
	{
		dr.get(url);

	}

}
