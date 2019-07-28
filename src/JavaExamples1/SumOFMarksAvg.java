package JavaExamples1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Program to find calculate sum, average and check if pass or fail. 
 * Step 1: Start  
 * Step 2: Read marks in five subjects  
 * Step 3: Sum=m1+m2+m3+m4+m5  
 * Step 4: Avg = sum/5f  
 * Step 5: Print the sum and average  
 * Step 6: If (m1>40) and (m2>40) and(m3>40) and(m4>40) and(m5>40) then pass else fail  Step 8: Stop */

public class SumOFMarksAvg {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader is = new InputStreamReader(System.in);
		
		// When using BufferedReader we need to use InputStreamReader
				// What - data are you reading 
				// Where - from where 
				// How - and in which format
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("Enter the marks");
		int m1, m2, m3,m4,m5,Sum;
		float Avg;
		
		m1 = Integer.parseInt(br.readLine());
		m2 = Integer.parseInt(br.readLine());
		m3 = Integer.parseInt(br.readLine());
		m4 = Integer.parseInt(br.readLine());
		m5 = Integer.parseInt(br.readLine());
		
		Sum = m1+m2+m3+m4+m5;
		System.out.println(Sum);
		
		Avg = Sum/5;
		System.out.println(Avg);
		
		if ((m1 < 40) && (m2 < 40) && (m3 < 40) && (m4 < 40) && (m5 < 40))
		{
			System.out.println("Fail");
		}
				
	  else if (((m1 > 40) && (m1 <= 100)) && ((m2 > 40) && (m2 <= 100)) && ((m3 > 40) && (m3 <= 100)) && ((m4 > 40) && (m4 <= 100)) && ((m5 > 40) && (m5 <= 100)))
	  {
		  System.out.println("Pass");
	  }
		
		if (Avg >= 60)
		{
			System.out.println("First Class : " + Avg);
		}
		else if (Avg >= 50)
		{
			System.out.println("Second Class : " + Avg);
		}
		
		
	}

}
