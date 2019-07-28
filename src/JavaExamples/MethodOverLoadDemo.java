package JavaExamples;

public class MethodOverLoadDemo 
{
	// Method overloading 
			// Multiple methods with the same name 
			// if the no of parameter is same the data type should be different\
	
	void add (int a, int b, int c) // 1 //
	
	{
		System.out.println(a+b+c);
	}
								// 2 //
	void add (int a, double b, int c) //if the no of parameter is same the data type should be different
	{
		System.out.println(a*b*c); 
	}									// 3 //
	void add (int a, int b, int c, int d) // method with parameter and not returning any value
	{
		System.out.println(a*b*c*d);
	}
	public static void main(String[] args) 
	{
		MethodOverLoadDemo de = new MethodOverLoadDemo ();
		// calling by method logic 
		de.add(100, 200, 300); // 1 //
		de.add(100, 100.4, 400); // 2 //
		de.add(10, 200,300, 100); // 3 //
		
	}

}
