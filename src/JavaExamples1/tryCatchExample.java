package JavaExamples1;

public class tryCatchExample {

	// Unchecked Exceptions
	
			// Arithmeticexceptions
			// NullPointer Exceptions
			// NumberFromat exceptions
			// ArrayIndexOutofBoundExceptions
			
			
			// Checked exceptions
			
			//Interrupted Exceptions
			//IOExceptions
			//FileNotFoundException
	public static void main(String[] args) 
	{
		// try and catch and finally block
					// divide any no by zerp
				try
				{
					int a = 50/0;
				}
				catch(ArithmeticException e)
				{
					System.out.println("Catch block");
					System.out.println(e);
				}
				finally
				{
					System.out.println("Final block");
				}
				System.out.println("Rest of the code...");
				
				///////////////////////////////////////////////
				System.out.println("///////////////////////////////////////////////");
				
				try
				{
					int a[] = null;
					System.out.println(a.length);
				}
				catch(NullPointerException e)
				{
					System.out.println("Catch block ....");
					
					System.out.println(e);
				}
				finally
				{
					System.out.println("Finally block....");
				}
				System.out.println("Rest of the code 1............");
				
				
				///////////////////////////////////////////////
				System.out.println("///////////////////////////////////////////////");
				
				
				try
				{
					String i = "abc";
					int a = Integer.parseInt(i); 
				}
				catch (NumberFormatException e)
				{
					System.out.println("Catch block...");
					System.out.println(e);
				}
				finally
				{
					System.out.println("Finally code..");
				}
				
				System.out.println("Rest of the code 2.....");
				
				
				///////////////////////////////////////////////
				System.out.println("///////////////////////////////////////////////");
				
				
				
				
				
	}

}
