package JavaExamples1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Writing the switch example

public class SwitchExample {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	
		InputStreamReader is = new InputStreamReader(System.in);
		// When we use Buffered Reader we use Input stream reader
			// what - data you are getting  
			// where - from where 
			// how - and in which format
		
		BufferedReader br = new BufferedReader(is);
		
		float a,b,c;
		
		a = Float.parseFloat(br.readLine());
		b = Float.parseFloat(br.readLine());
		
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mul");
		System.out.println("4.Div");
		
		System.out.println("Enter your choice : "); 
		int ch;
		ch = Integer.parseInt(br.readLine()); 
		c=0;
		
		switch(ch)
		{
		case 1: c=a+b;break;
		case 2: c=a-b; break;
		case 3: c=a*b; break;
		case 4: c=a/b; break;
		default: System.out.println("Invalid choice"); break;
		}
		System.out.println("Result is : " +c);
		}
		
		
	}


