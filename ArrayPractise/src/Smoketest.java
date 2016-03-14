import org.testng.annotations.Test;


public class Smoketest 
{	
	Utility u = new Utility();
	private int[] x={1,2,3,4,5,6,7,8,9,0};
	@Test
	public void execute()
	{
		u.m1(x);
		u.max();
	}
	
	
	
	
	
	
	
	
	
	
	
}
