package JavaExamples;

public class ConstructorDemo1 
{
	// Constructor has the same name as the class name 
	// Special type of a method
	// Constructor will automatically be initiated when creating an object of a class
	// Only for initialization of variables
	// Two type of constructors
		// Parameterized constructor
		// constructor does not return any variable
	
	int x,y;
	ConstructorDemo1() // Default constructor
	{
		x=100;
		y=200;
		System.out.println(x+y);
	}
	
	ConstructorDemo1(int a, int b)// parameterized constructor
	{
		x=a;
		y=b;
		System.out.println(x*y);
		
	}
	
	public static void main(String[] args) 
	{
		// in a constructor we don't need to pass the constructor via the object
		// it is initiated when the object is created (in the parameter)
		
		ConstructorDemo1 de = new ConstructorDemo1(); // default constructor
		
		ConstructorDemo1 de1 = new ConstructorDemo1(100, 200); // constructor with parameter 
	
	}

}
