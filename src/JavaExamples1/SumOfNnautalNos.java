package JavaExamples1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*Step 1: Start  
 * Step 2: 
 * Read the value of n.  
 * Step 3: for i=1 to n  
 * Step 4: sum=sum+i  
 * Step 5: Display the sum  Step 
 * 6: Stop */

public class SumOfNnautalNos {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	
		Scanner sc = new Scanner(System.in);
		
		int i,n;
		
		int sum=0;
		System.out.println("Enter the no :");
		n = sc.nextInt();
		
		for (i=1; i<=n; i++)
		{
			//sum+=i;
			sum=sum+i;
		}
		System.out.println("The sum  is : " +sum);
		
	}

}
