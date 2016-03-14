package com.bit.support;

public class A
{	
	//A Class can only be declared as default or public only
	
	public int publicVariable = 5;
	private int privateVariable = 10;
	protected int protectedVariable = 15;
	private int defaultVariable = 20;
	public int getPrivateVariable() 
	{	privateVariable = 1;
		return privateVariable;
	}
	public void setPrivateVariable(int privateVariable) {
		this.privateVariable = privateVariable;
	}
	public int getDefaultVariable() {
		return defaultVariable;
	}
	public void setDefaultVariable(int defaultVariable) {
		this.defaultVariable = defaultVariable;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}