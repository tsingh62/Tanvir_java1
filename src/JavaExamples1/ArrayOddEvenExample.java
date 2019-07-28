package JavaExamples1;

public class ArrayOddEvenExample {

	public static void main(String[] args) 
	{
		// Print the odd and even numbers from an array 
		
		int arr [] = {1,2,4,4,5,6,7,8};
		
		System.out.println("Print the odd numbers :");
		
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+ " ");
			}
		}
		System.out.println("");
		
		System.out.println("Print the even numbers : ");
		
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+ " ");
			}
		}
	
	
	}

}
