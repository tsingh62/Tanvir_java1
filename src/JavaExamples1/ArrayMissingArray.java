package JavaExamples1;

public class ArrayMissingArray {

	public static void main(String[] args) 
	{
	
		int[] arr = {10,9,3,6,4,7,8,1,2};
		
		int length = arr.length;
		
		int indexes = 10;
		int values = 0;
		
		for (int i = 0; i < length; i++) 
		{
			indexes += i+1;
			values += arr[i];
		}
		
		int result = indexes - values;
		
		System.out.println("Missing number is: "+result);
	}
		
}


