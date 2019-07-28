package JavaExamples;

// An interface in Java is a blue print of a class
// An interface contains final and static variables 
// An interface contains abstract methods
	// An abstract method is a method which contains a definition but not a body
// Interface supports the functionality of multiple inheritance 
	// We define interface with interface Keyword

//==============================================================================//

interface A // An interface is a blue print of a class
			// we define interface with interface keyword
{
	int a=10; // An interface contains final and static keywords
	// An interface contains abstract methods
	void m1(); // An abstract method is one which has a definition but no body
	
}
 
public class DemoInterface implements A // for interface we use implements
{
	public void m1() // In interface methods are public by default
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		DemoInterface de = new DemoInterface();
		// Creating an object of class DemoInterface
		de.m1(); // calling method via object

		// We cannot create an object for an interface 
		// But we can create an instance of the variable
	}

}
