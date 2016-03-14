import org.junit.Test;


public class SmokeTest extends BaseTest

{	HomePage hp;
	@Test
	public void test()
	{
		 hp = new HomePage(dr).get();
		 hp.verifyTitle();
		 dr.navigate().refresh();
		 Men mp = hp.clickMen();
		 mp.verifyTitle();
		 
		 
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
