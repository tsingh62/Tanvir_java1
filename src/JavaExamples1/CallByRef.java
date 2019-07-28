package JavaExamples1;

public class CallByRef 

{
	// call by ref 
		int x;
		
		public void add(CallByRef a) // here a is an object
		{
			x = a.x + 5; // here a is the object and x is the variable
		
			// Whatever value is put into x below is added to 5 and 
			// passed into x.
		}
	

	public static void main(String[] args) 
	{

		CallByRef callbyrefobject = new CallByRef();
		callbyrefobject.x=10; // object.x (object and variable)
		
		callbyrefobject.add(callbyrefobject);
		System.out.println(callbyrefobject.x); // 15
		
	}

}
