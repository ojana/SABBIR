import org.junit.Test;


public class Demo 
{
	@Test
	public void m1()
	{
		String s = "how are you";//Here this String is a Class & s is the reference of this Class.
		Integer i = new Integer(3);
		int a = 7;
		
		if(s.equals("sabbir"))
		{
			System.out.println("matched");
		}
		
		else
			System.out.println("not");
		System.out.println(s.charAt(1));//it prints index "1"= o alphabet
		String s1 = s.concat("sabbir");
		System.out.println(s.concat("sabbir"));//how can i add space
		System.out.println(s);
		System.out.println(s.compareTo(s1));//problem
		System.out.println(s.contains("lata"));
		System.out.println(s.endsWith("you"));
		System.out.println(s.length());
		System.out.println(s.indexOf("w"));
		System.out.println(s.replace("how", "who"));
		System.out.println(s.substring(4, 8));
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());//it cuts the space of The String From first & last as well 
		String[]f=s.split("");//**problem
		System.out.println(f[2]);
		String s2 = "5";
		String s3 = "999";
				int b = Integer.parseInt(s2);
				int c = Integer.parseInt(s3);
				System.out.println(b+c);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
