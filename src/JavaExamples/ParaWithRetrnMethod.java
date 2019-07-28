package JavaExamples;

public class ParaWithRetrnMethod 
{
	// Calling method in different ways  - Part 1 //
	
	// Case 3//
	void sum (int a, int b) // method with parameter and does not have any return type
	{
		System.out.println(a+b);
	}
	
	// Case 4//
	int sum1(int a, int b)// method with parameter and does have a return type
	{
		return (a*b);
	}
	
	
	
	public static void main(String[] args) 
	{ 
		ParaWithRetrnMethod me = new ParaWithRetrnMethod ();
		me.sum(100, 200);
		
		// For method with return type we need to pass the value into a variable and then print it 
		int result = me.sum1(200, 500);
		System.out.println(result);
	
	}

}
