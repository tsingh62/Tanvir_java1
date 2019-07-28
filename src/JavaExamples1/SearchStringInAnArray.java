package JavaExamples1;

import java.util.Arrays;

public class SearchStringInAnArray {

	public static void main(String[] args) 
	{
	
		String name [] = {"Aplha", "Beta", "Gamma", "Omega"};
		
		String tofind = "ok";
		boolean found = false;
		
		for(int i=0; i<name.length; i++)
		{
			if(Arrays.asList(name).contains(tofind))
			{
				found = true;
				System.out.println("String present : " +tofind +" " +found);
				break;
			}
			else
			{
				System.out.println("String not present : ");
				break;
			}
		}
		
		
	}

}
