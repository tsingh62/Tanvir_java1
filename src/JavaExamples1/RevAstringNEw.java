package JavaExamples1;

public class RevAstringNEw {

	public static void main(String[] args) 
	{
		String str = "The sky is blue";
		
		String s []= str.split(" ");
		String rev = "";
		
		for(int i = s.length-1; i>=0; i--)
		{
			rev = rev + s[i] + " ";
		}
		System.out.println(rev);
	}
	}


