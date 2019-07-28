package JavaExamples1;



/*
 * The GCD (Greatest Common Divisor) of two numbers is the largest positive 
 * integer number that divides both the numbers without leaving any remainder. 
 * For example. GCD of 30 and 45 is 15. 
 * GCD also known as HCF (Highest Common Factor). 
 * In this tutorial we will write couple of different Java programs to find out the GCD of two numbers.
 * */
public class GCDofTwoNos {

	public static void main(String[] args) 
	{
		
		//Lets take two numbers 55 and 121 and find their GCD
        int num1 = 55, num2 = 121, gcd = 1;

        /* loop is running from 1 to the smallest of both numbers
         * In this example the loop will run from 1 to 55 because 55
         * is the smaller number. All the numbers from 1 to 55 will be 
         * checked. A number that perfectly divides both numbers would
         * be stored in variable "gcd". By doing this, at the end, the 
         * variable gcd will have the largest number that divides both
         * numbers without remainder.
         */
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }

        System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
    }

}