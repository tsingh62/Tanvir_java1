package JavaExamples;

public class CallByReferenceDemo 
{
	int x; // Global variable / Instance variable / Class variable
	
	public void add(CallByReferenceDemo a) // Here a is the object for CallByReferenceDemo 
								// In call by ref the class name is passed as the parameter 
	{
		x=a.x+5;  // when a new value is assigned to 'a.x', 'a.x' will be added to 5 and then
					// assigned to x
		
		// Here within the 'a' object there is a 'x' variable 
		// An object contains variables + methods
	}

	public static void main(String[] args) 
	{
		CallByReferenceDemo object = new CallByReferenceDemo();
		
		object.x=10; // since 'a' is the object of class so
						// object.x=10 then will pass the value of 10 into
						//a.x
		// now we use the object call the object inside the method
		object.add(object);
		System.out.println(object.x); //15
	}

}
