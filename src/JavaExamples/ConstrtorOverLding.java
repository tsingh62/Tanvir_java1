package JavaExamples;

public class ConstrtorOverLding 
{
	// A class can have multiple constructors
	
	ConstrtorOverLding(int a, int b) // Constructor has the same name as the class name	
					//1//				// constructor with parameter
	{
		System.out.println(a*b);
	}
	ConstrtorOverLding (int a, int b, int c) //2//
	{
		System.out.println(a*b*c);
	}
	ConstrtorOverLding (int a, int b, double c) //3//
	{
		System.out.println(a*b*c);
	}
	

	public static void main(String[] args) 
	{
	
		ConstrtorOverLding cst = new ConstrtorOverLding(100,200); //1//
		ConstrtorOverLding cst1 = new ConstrtorOverLding(100,200,300);//2//
		ConstrtorOverLding cst2 = new ConstrtorOverLding(100,200,300.5);//3//
		
	}

}
