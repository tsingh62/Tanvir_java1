package JavaExamples1;

import java.util.Scanner;

public class RepeatedCharOfaString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("please Enter String : "); 
		
		String name = sc.next(), rev=""; 

		for(int i=0; i<name.length(); i++) 
		{ 
			int count=0; 
			for(int j =0; j<name.length(); j++) 
			{ 
				while(name.charAt(i)==name.charAt(j)) 
				{ 
					count++; 
					break; 
				} 
			} 
		if(rev.indexOf(name.charAt(i))!=-1) 
		{ 
			System.out.print(""); 
		}
		else
		{  
			rev +=name.charAt(i); 
			System.out.println("character = "+name.charAt(i)+" and count is = "+count); 
		} 
		} 
	} 
		
}
