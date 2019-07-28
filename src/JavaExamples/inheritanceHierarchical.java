package JavaExamples;

// Class A  // Parent 

// to 

// Class B , Class C and Class D // Child



class Parent // Parent class
{
	int a; // Global variable / instance variable / class variable 
	void display() // method with no parameter and does not pass nay value
	{
		System.out.println(a); // printing value of class variable 
	}
}

class child1 extends Parent// Child of Class Parent 
{
	int b;// Global variable / instance variable / class variable 
	void show() // method with no parameter and does not pass nay value
	{
		System.out.println(b); // printing value of class variable 
	}
}

class child2 extends Parent //Child of Class Parent
{
	int x;// Global variable / instance variable / class variable 
	void print() // method with no parameter and does not pass nay value
	{
		System.out.println(x); // printing value of class variable 
	}
}
public class inheritanceHierarchical 
{

	public static void main(String[] args) 
	{
		Parent object = new Parent();
		object.a=100; // Object created here is different from other objects
		object.display();
		
		// Child1
		child1 object1 = new child1();
		object1.a=100; // from Parent // Object created here is different from other objects
		object1.display();
		object1.b=200; // from child1 // Object created here is different from other objects
		object1.show();
		
		// Child2
		child2 object2 = new child2();
		object2.a=100; //from parent // Object created here is different from other objects
		object2.display();
		object2.x=300; // from child2 //Object created here is different from other objects
		object2.print();
	}

}
