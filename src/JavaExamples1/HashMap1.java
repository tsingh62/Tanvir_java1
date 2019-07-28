package JavaExamples1;


import java.util.Map;

import java.util.HashMap;



public class HashMap1 {

	public static void main(String[] args) 
	{

		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Omega");
		hm.put(102, "Alpha");
		hm.put(103,"Delta");
		
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getValue()+ " " +m.getKey());
		}
		
		hm.remove(102); // put key value
		
		System.out.println("");
		
		for(Map.Entry m1 : hm.entrySet())
		{
			System.out.println(m1.getValue()+ "  " +m1.getKey());
		}
	}

}
