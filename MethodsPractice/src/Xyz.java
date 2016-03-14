
public class Xyz 
{
	int a = 5;
	int b;
	String c= "hi";
	String d;
	
	
	//we have to declare a regular void method when we only going to use that
	//We can only use this method and can't be modified
	void regularMethod()
	{
		System.out.println("This is Regular Method");
	}
	
	//When we have get the value from the user then we have to declare The Parameterized Method.
	//we have to declare a variable inside the parameter based on which ever value will be given by the user. 
	
	void parameterized(int a, String s)
	{
		 
		System.out.println(a+s);
		
	}
	
	/*When we want give any value to the user using the method, then we declare return type method
	*return type has to be the same name as method return type
	*we can return 3 types of information
	*1. Value : means data
	*2. Variable: means a place holder that holds any value 
	*3. Method : method has to be return type and return value has to be the same DATA Type as the Method returns 
	*/
	
	int returntype()
	{
		
		return a;
	}
	
	int Abc()
	{	
		int j = 15;
		System.out.println(j);
		return 10;//10 is value OR j is variable OR returntype() is a Method 
	}
	
	String m0()
	{
		
		return d;
	}
	
	
}
