package JavaExamples1;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		// Sum of digits 
	
		int num = 12345;
		
		int rev = 0;
		
		while(num>0)
		{
		//	rev = rev*10;
			rev = rev + num%10;
			num = num/10;
		}
		System.out.println(rev);
		
		
	}

}
