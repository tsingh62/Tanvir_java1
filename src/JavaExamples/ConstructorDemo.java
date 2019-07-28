package JavaExamples;

public class ConstructorDemo 
{
	int sid; // Global variables / instance variable / class variable 
	String name;
	char grade;
	
	// Constructor has the same name as that of a class
		// a constructor is initiated when an object of class is created
	ConstructorDemo (int id, String n, char g)
	// Constructor with parameters and does not return any value
	{
		sid = id; // passing the value of the constructor into the class variable
		name = n;
		grade = g;
		
	}
	void getValue(int i, String a, char r) // method with parameters but does not return any value
	{
		sid = i; // passing the local variables of getValue method into the class variable 
		name = a;
		grade = r;
		
	}
	void display() //  method with no parameter and does not pass any return value 
	{
		System.out.println(sid + "  " + name + "  " + grade);
		
	}

	public static void main(String[] args) 
	{
		ConstructorDemo de = new ConstructorDemo(100,"Tanvir",'A');
		// for a constructor we need to pass the value in the parameter of the constructor itself
		de.display();
		
		//call by method
		de.getValue(101, "Ronnie", 'A');
		de.display();
		
	}

}
