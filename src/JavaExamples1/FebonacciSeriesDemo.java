package JavaExamples1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*Fibonacci series is series of natural number 
 * where next number is equivalent to the sum of 
 * previous two number e.g. fn = fn-1 + fn-2. 
 * The first two numbers of Fibonacci series is always 1, 1. 
 * In this Java program example for Fibonacci series, 
 * we create a function to calculate Fibonacci number and 
 * then print those numbers on Java console. 
 * Another twist in this questions is that sometime interviewer 
 * asks to write a Java program for Fibonacci numbers using recursion, 
 * so it's better you prepare for both iterative and recursive version of Fibonacci number.
Read more: http://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html#ixzz5n56DhH6a*/

/*Java program to calculate and print Fibonacci number 
 * using both recursion * and Iteration. 
 * * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2 * 
 * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

Read more: http://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html#ixzz5n5DE6uwd*/
public class FebonacciSeriesDemo {

	public static void main(String[] args) 
	{
		// Set it to the number of elements you want in the Fibonacci Series
				 int maxNumber = 10; 
				 int previousNumber = 0;
				 int nextNumber = 1;
				 
			     System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
		 
			     for (int i = 1; i <= maxNumber; ++i)
			     {
			            
			    System.out.print(previousNumber+" ");
			            /* On each iteration, we are assigning second number
			             * to the first number and assigning the sum of last two
			             * numbers to the second number
			             */
		 
			      
			            int sum = previousNumber + nextNumber;
			            previousNumber = nextNumber;
			            nextNumber = sum;
			        }
		 
	}

}
