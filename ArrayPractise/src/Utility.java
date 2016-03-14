import java.util.Arrays;

import org.testng.annotations.Test;


public class Utility 
{
	public void m1(int[]x)
	{
		//Arrays.sort(x);//sort gives value ascending order by default.  
		System.out.println("max num: "+ x[x.length-1]);//here i can see which one is maximum number & i indicate that number to print.
		System.out.println("min num: "+ x[0]);
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		for(int i=x.length-1;i>0;i--)
		{
			System.out.println(x[i]);
		}
		
	}
	
	@Test
	public void max()
	{
		int m[]={0,232,1000,5,54,3};
		int mx=m[0];
		for(int i=1;i<m.length;i++)
		{
			if(m[i]>mx)
			{
				mx=m[i];
			}
		
		}
		System.out.println(mx);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
