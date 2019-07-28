package JavaExamples;

public class CallByValueDemo 
{
	int x; // Global variable / Class variable / Instance variable
	// Variables defined at the class level can be accessed by all methods within the class
	
	public void addition(int a) // method with parameter and does not return any value
	{
				// the value passed in int a will be passed into a (x=a+5)
				// so if int a is 10 then the value of a=10
		x = a+5;   
	}
	
	public static void main(String[] args) 
	{
		CallByValueDemo object = new CallByValueDemo();
		// Since variables defined inside a method are local
		// When a variable is created within a method it is used for the method and 
			// cannot be used else where
		// They need to be accessible globally
		// Now we need to pass int x =10 to int a in method addition
		int x=10; 
		object.addition(x); // This would still print 10
		System.out.println(x); // the value printed here is 10
		
		// To print the value of x=10+5 =15 we need to call the object and the variable 
			// after calling the object with the method and variable 
		
		// 1st call the object with the method and the variable
		// object.addition(x); then 
		// 2 nd call the object and variable which 
		// object.x
		System.out.println(object.x); //15
		
	}

}
