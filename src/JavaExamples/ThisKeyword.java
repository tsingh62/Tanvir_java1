package JavaExamples;

public class ThisKeyword 
{

	int a, b; // Class variables/ Instance variables / Global variables
	
	void add (int a, int b) // method with parameter and does not return any value
	{			// here int a and int b defined in the add method are local parameters
				// they will be accessed globally if they are not equated to int a, b 
				// which are the class variables
		
		this.a=a;		// here we use this.a and this.b to let the program know
		this.b=b; 		// that this refers to the global variables/class variables
					// and the local variables are assigned to the global variables
	}
	
	void display() // method with no parameters and does not return any value
	{
		System.out.println(a + "   " + b);
	}
	public static void main(String[] args) 
	{
		// VIP if we do not put this.a and call the method add and pass values in it
		// it will display 0,0
		// Only once we put this.a and this.b will the values be displayed once we call the method
		ThisKeyword tk = new ThisKeyword ();
		tk.add(100, 200);
		tk.display();
	
	}

}
