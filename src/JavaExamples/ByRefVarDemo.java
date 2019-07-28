package JavaExamples;

public class ByRefVarDemo 
{
	int id; // Global variable/class variable / instance variable
	String job;
	String ename;
	
	void dsiplay () // method with no return type and does not pass any parameters
	{
		System.out.println(id); // printing values for class variables 
		System.out.println(job);
		System.out.println(ename);
	}
	
	public static void main(String[] args) 
	{
		ByRefVarDemo de = new ByRefVarDemo (); // creating an object of class ByRefVarDemo 
		// calling variables using object of the class
		// using the logic call by reference variables 
		de.id = 100;
		de.job = "CEO";
		de.ename = "Tanvir";
		// now using call by method option
		de.dsiplay();
		
		
	}

}
