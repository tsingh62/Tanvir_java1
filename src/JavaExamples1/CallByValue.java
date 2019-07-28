package JavaExamples1;

public class CallByValue 

{
	
	int x; // global variable/ instance variable / class variable 
	
	public void addition(int a)
	{
		x = a+5;
		
		// here the value passed (added below) into a will be added to 5
	}

	public static void main(String[] args) 
	{
		CallByValue callbyvalueobject = new CallByValue();
		
		int x=10; // varible defined in the method
		
		callbyvalueobject.addition(x); //10
		
		System.out.println(callbyvalueobject.x); // 15
		
		
	}

}
