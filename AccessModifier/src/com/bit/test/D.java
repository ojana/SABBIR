package com.bit.test;

import com.bit.support.A;

public class D extends A 
{
	A x = new A();
	
	public void abc()
	{
		// public variable in different package
		System.out.println(x.publicVariable);
		
		//Inheritance 
		//System.out.println(publicVariable);
		
		//we can't access privateVariable in different  package but can be access by getter or setter
		System.out.println( x.getPrivateVariable());
		
		//protectedVariable can be access by inheritance in the different  package
		System.out.println(protectedVariable);
		
		//default Variable in the different package
		System.out.println((x.getDefaultVariable()));
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
