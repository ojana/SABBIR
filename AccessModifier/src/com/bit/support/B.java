package com.bit.support;

public class B 
{

	A x = new A();
	
	public void m1()
	{
		//object creation public variable
		System.out.println(x.publicVariable);
		
		//Inheritance 
		//System.out.println(publicVariable);
		
		//we can't access privateVariable in the same package 
		//System.out.println(privateVariable);
		
		//protectedVariable can be access in the same package
		System.out.println(x.protectedVariable);
		
		//default Variable in the same package
		System.out.println(x.getDefaultVariable());
		
				
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
