package JavaExamples;

public class RetrnMethodDemo 
{
	// Calling method in different ways  - Part 1 //
	
	// Case 1 //

	int x, y;
	
	void sum() // method with no parameter and does not return any value 
	{
		System.out.println(x * y * y * x);
	}
	
	// Case 2 // 
	
	int sum1() // method with no parameter but returns as value 
	{
		return (x*x+y*y+x*y);
	}
	public static void main(String[] args) 
	{
		RetrnMethodDemo de = new RetrnMethodDemo ();
		de.x=100;
		de.y=300;
		// call by method sum()
		de.sum();
		
		// for return type we need to pass the object.method into a variable and then print it
		int result = de.sum1();
		System.out.println(result);
	
	}

}
