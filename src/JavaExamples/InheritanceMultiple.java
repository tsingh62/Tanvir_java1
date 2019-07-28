package JavaExamples;

// Inheritance Multiple 

// Interface A  // Interface B

		// Implements 

	// Class C
// An interface is a blue print of a class
// An interface has variables which are static and final
// An interface has abstract method
	// An abstract method is one which has a definition but no body
//By default methods in interface are public
// An interface uses "interface" as a keyword
// Interface uses "implements" as a keyword for inheritance 

// We cannot create an object of an interface
// We can create an instance of the variable

//================Multiple Inheritance==========================//

interface ABC //An interface is a blue print of a class
{
	int x=100; // By default variables in an interface are static and final
	void m1(); // Methods in interface are public by default and have a definition 
				// but no body
}

interface XYZ // An interface is a blue print of a class
{
	int y=200; // By default variables in an interface are static and final
	void m2(); // Methods in an interface are public by default and have a definition but no body
}
public class InheritanceMultiple implements ABC,XYZ
{
	// Interface methods' body can be enhanced in the child class 
	
	public void m1() // By default methods in interface are public 
					// so we need to add public here 
	{
		System.out.println(x);
	}
	public void m2()
	{
		System.out.println(y); // By default methods in interface are public
								// so we need to add public here 
	}
	

	public static void main(String[] args) 
	{
		InheritanceMultiple de = new InheritanceMultiple();
		//
		de.m1();
		de.m2();
		
	}

}
