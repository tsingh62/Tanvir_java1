package ExtentReporting;

public class NoOfDigits {

	public static void main(String[] args) 
	{
		
		int count = 0;
		int num = 123456789;
		
		while (num !=0)
		{
			num=num/10;
			++count;
		}
		System.out.println("The number is : " + count);

	}

}
