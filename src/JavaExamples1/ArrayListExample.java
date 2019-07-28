package JavaExamples1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) 
	{
ArrayList<String> list = new ArrayList<String>();
		
		list.add("Omega");
		list.add("Delta");
		list.add("Alpha");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		list.remove(0); // remove by index value 
		
		System.out.println(" ");
		
		for(String i : list)
		{
			System.out.println(i);
		}
		
		System.out.println(" ");
		
		for(Object o : list)
		{
			System.out.println(o);
		}
	}

}
