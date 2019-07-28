package JavaExamples;

// Single Inheritance 

//  Class A
	// to
//  Class B

class A1 // Parent class
{
	int a;  // Global Variable / Instance Variable / Class variable
	// Variables defined as class variables can be accessed by all methods within the class
	
	void display() // method with no parameter and does not return any value
	{
		System.out.println(a); // printing value of global variable 
	}
}

class B1 extends A1// Child class of class A1
{
	int b;// Global variables / class variable / instance variable 
	// variables defined as class variables can be accessed by all methods within the class
	void print() // method with no parameter and does not return any value
	{
		System.out.println(b); // printing value of global variable
	}
}


public class InheritanceSingle  
{

	public static void main(String[] args) 
	{
		A1 object1 = new A1(); // Creating an object of class A1
		object1.a=100; // Here the object is different from object in B1
		object1.display();
		
		//================================================================//
		B1 object = new B1(); // creating an object of class B1
		object.a=100; // calling value from parent class A1 via class B1
		object.display();
		object.b=200; // calling value from child class B1 via class B1
		object.print();
	}

}
