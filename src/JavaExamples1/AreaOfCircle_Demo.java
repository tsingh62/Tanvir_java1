package JavaExamples1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Step 1: Read value of r. 
 Step 2: a = 3.14*r*r 
 Step 3: print area a. 
 Step 4: Stop */

public class AreaOfCircle_Demo {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	
		InputStreamReader is = new InputStreamReader(System.in);
		// Input stream Reader used when BufferedReader is used
		// Buffered reader 
			// what - what data are you entering 
			// when - from where 
			// how - and in which format
		
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Type in the value of r (Radius)");

		float r,a;
		
		r = Float.parseFloat(br.readLine());
	
		a = 3.14f*r*r; // need to add f in-front of float to add in to the formula
		
		System.out.println("The area of the circle is : " +a);
		
	}

}
