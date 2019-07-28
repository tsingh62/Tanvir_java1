package JavaExamples1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Step 1: Read values for a and b. 
 Step 2: c=a+b, d=a-b, e=a*b,f=a/b 
 Step 3: print c,d,e and f 
 Step 4: Stop 
 
 * */
public class arithmaticOperations_Demo {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader is = new InputStreamReader(System.in);
		// When we use Buffered reader we need to use InterStreamReader
		BufferedReader br = new BufferedReader(is);
		
		float a,b,c,d,e,f;
		System.out.println("Enter the Numbers");
		a = Float.parseFloat(br.readLine()); // Convert string into float
		b = Float.parseFloat(br.readLine());
	//	c = Float.parseFloat(br.readLine());
		
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		
		
		System.out.println(a + " + " + b + " " + "=" + c);
		System.out.println(a + "-" + b + " " +  "=" + d);
		System.out.println(a + "*" + b + " " + "=" + e);
		System.out.println(a + "/" + b + " " + "=" + f);
		

	}

}
