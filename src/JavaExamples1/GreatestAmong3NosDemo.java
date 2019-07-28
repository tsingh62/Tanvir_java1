package JavaExamples1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Step 1: Start 
 Step 2: Read a, b and c 
 Step 3: if a>b and a>c print “A is greatest”. 
 Step 4: else if b>c print “B is greatest”. 
 Step 5: else print “C is greatest”.  */
public class GreatestAmong3NosDemo {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader is = new InputStreamReader(System.in);
		
		// When Buffered Reader is used we use InputStreamReader
		
				// Buffered Reader
					// When - data are you getting 
					// where - from where 
					// how - and in which format
		
		 BufferedReader br = new BufferedReader(is);
		 
		 System.out.println("Enter the values : ");
		 int a,b,c;
		 
		 a = Integer.parseInt(br.readLine());
		 b = Integer.parseInt(br.readLine());
		 c = Integer.parseInt(br.readLine());
		 
		 if ((a > b) && (a > c))
		 {
			 System.out.println("The greatest number is : " +a);
		 }
		else if ((b > a) && (b > c))
		 {
			 System.out.println("The greatest number is : " +b);
		 }
		else if ((c > a) && (c > b))
		{
			System.out.println("The greatest number is : " +c);
		}
		
	}

}
