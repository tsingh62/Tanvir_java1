package JavaExamples1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTwoNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		InputStreamReader is = new InputStreamReader(System.in);
		// When we create an object of the bufferedReader we have 
		// to create an object of the InputStreamReader
		
		// Buffered reader refers to 
			// what - data you are getting
			// where - from where
			// how - and in which format
		BufferedReader br = new BufferedReader(is);
		int a,b,c;
		 
		a= Integer.parseInt(br.readLine()); // to read from br we use the method br.readline
											// since read line takes a string
											// we need to convert it to integer
											// we use parse int (since parseInt is static)
											// we need to declare Ingeter to get the value in integer
		b= Integer.parseInt(br.readLine());
		
		c=a+b;
		System.out.println("The sum is  : " +c);
		
	
	}

}
