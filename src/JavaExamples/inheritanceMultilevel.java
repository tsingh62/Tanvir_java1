package JavaExamples;


class A11 // Parent class
{
	int a; // Global variable / instance variable / class variable  
	void display() // method with no parameter and does not return any value
	{
		System.out.println(a); // printing value for class variable 
	}
}
class B12 extends A11// Child class of A11
{
	int b; // Global variable / instance variable / class variable 
	void print() // method with no parameter and does not return any value 
	{
		System.out.println(b); // printing the value for class variable 
	}
}

class C13 extends B12// Child class of B12
{
	int c;  // Global variable / instance variable / class variable 
	void show() // method with no parameter and does not return any value
	{
		System.out.println(c); // printing the value for class variable 
	}
}

public class inheritanceMultilevel 
{

	public static void main(String[] args) 
	{
	A11 object1 = new A11(); // Creating an object of class A11
	object1.a=100; // Object created here is different than in B12 and C13
	object1.display();
	
	// Child B12
	B12 object2 =new B12(); // Creating an object of class B12
	object2.a=100; // from class A11//Object created here is different than in A11 and C13
	object2.display();
	object2.b=200; // from class B12 // object created here is different than in C13
	object2.print();
		
	
	// Child C13
	C13 object3 = new C13(); // Creating an object of class C13
	object3.a=100; // from class A11
	object3.display();
	object3.b=200; // from class B12
	object3.print();
	object3.c=300; // from class C13
	object3.show();
	}

}
