package JavaExamples1;

public class SplitNointoDigits {

	public static void main(String[] args) 
	{
		// Split the num into digits 
		
				int num = 12345;
				
				int rev = 0;
				
				while(num>0)
				{
				
					System.out.println(rev + num%10);
					num = num/10;
				}
	}

}
