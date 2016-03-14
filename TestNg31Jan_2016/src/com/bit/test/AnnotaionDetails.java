package com.bit.test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AnnotaionDetails 
{	
	/*When ever we configure our XML file, we must run project from the XML file. Not from 
	* 1st = suite
	* 2nd = Before & After test
	* 3rd = class; Write the package name before Class name
	* 5th = method
	* 6th = if there are more than 1 test then compiler will next test annotation
	
	
	*/
	@BeforeSuite
	public void m9()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void m10()
	{
		System.out.println("AfterSuite");
	}
	@Test
	public void m1()
	{
		System.out.println("test01");
	}
	
	@Test
	public void m2()
	{
		System.out.println("test02");
	}
	
	
	@BeforeTest
	public void m7()
	{
		System.out.println("I am Before Test");
	}
	
	
	@AfterTest
	public void m8()
	{
		System.out.println("I am After Test");
	}
	
	@BeforeMethod
	public void m3()
	{
		System.out.println("I am BeforeMethod");
	}
	
	
	@AfterMethod
	public void m4()
	{
		System.out.println("I am AfterMethod");
	}
	
	
	@BeforeClass
	public void m5()
	{
		System.out.println("I am Before Class");
	}
	
	
	@AfterClass
	public void m6()
	{
		System.out.println("I am After Class");
	}
}
