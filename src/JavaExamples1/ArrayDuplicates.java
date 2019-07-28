package JavaExamples1;

public class ArrayDuplicates {

	public static void main(String[] args) 
	{
		// Print duplicates in array 
		
		
		int arr [] = {1,2,3,4,1,2,3,6,7};
		
		
		for(int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if((arr[i]==arr[j])&&(i!=j))
				{
					System.out.println("The  duplicate numbers are : " +arr[j]);
				}
			}
		}
		
    }    
}
		 
	


