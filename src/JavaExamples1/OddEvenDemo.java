package JavaExamples1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Step 1: Start 
Step 2: Read the no n 
Step 3: If n%2 = 0 then print even 
Step 4: If n%2=1 then print odd 
Step 5: Stop */

public class OddEvenDemo {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	
		InputStreamReader is = new InputStreamReader(System.in);
		
		// With buffered Reader we need to use Input Stream Reader 
			// what - data are you getting 
			// When from where
			// How - and in which format
		
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter the number : ");
		int num;
		
		num = Integer.parseInt(br.readLine());
		
		if (num%2==0)
		{
			System.out.println("The number is even : " +num);
			
		}
		else
		{
			System.out.println("The number is odd : " +num);
		}
		
	}

}
