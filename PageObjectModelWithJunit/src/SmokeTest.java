import org.junit.Test;


public class SmokeTest extends Support
{
	HomePage hp;
	Gift gf;
	 SmallGoods smallGoods;
	@ Test
	public void test01()
	{	dr.manage().window().maximize();
		hp=new HomePage(dr);
		hp.verifyTitle();
		gf=hp.clickGift();
		gf.verifyTitle();
	    smallGoods=gf.clickSmallGoods();
	    smallGoods.verifyTitle();
	    
	}
	
	/*@ Test
	public void test02()
	{	
		gf=hp.clickGift();
		gf.verifyTitle();	
	    smallGoods=gf.clickSmallGoods();
	    smallGoods.verifyTitle();
	    
		
	}*/
	
	
	
	
	
	
	
	
	
	
}
