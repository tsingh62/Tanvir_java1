package JavaExamples1;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String args[]) 
	{
	      String[] myArray = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j", "AAAA"};
	
	 //     int size = myArray.length;

	      for(int i = 0; i<myArray.length; i++) 
	      {
	         for (int j = i+1; j<myArray.length; j++) 
	         {
	            if(myArray[i].compareTo(myArray[j])>0) 
	            {
	               String temp = myArray[i];
	               myArray[i] = myArray[j];
	               myArray[j] = temp;
	            }
	         }
	      }
	      System.out.println(Arrays.toString(myArray));
	   }
	}