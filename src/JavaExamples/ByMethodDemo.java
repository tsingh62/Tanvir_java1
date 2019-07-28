package JavaExamples;

public class ByMethodDemo 
{
	int sid; // Class variable/ Global variable / Instance variable
	String ename;
	char grade;
	
	void getValue (int id, String n, char g) // method with parameters and does not return any value
	{
		sid = id; // the parameters passed in the getValue method are local 
		ename = n; // now we pass the value of the local variable to global variables
		grade = g ;
		
	}
	
	void display()
	{
		System.out.println(sid + " " + ename + "  " + grade);
	}
	public static void main(String[] args) 
	{
		ByMethodDemo de = new ByMethodDemo ();
		// call by ref variable using object of class ByMethodDemo 
		de.sid = 100;
		de.ename = "Tanvir";
		de.grade = 'A';
		de.display();
		
		//using logic call by method 
		de.getValue(101, "Ronnie", 'A');
		de.display();
	
	}

}
