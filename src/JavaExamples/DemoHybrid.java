package JavaExamples;


			// Class A (class to interface not possible)
						// So class A extends to class B


	// Interface B		// Interface C (Interface B and C extend to class D)

			// Class D

class AA // Will extend to class DD
			// Class to interface not possible

{
	void m1()
	{
		System.out.println("This is M1 from A1 class");
	}
}
interface BB // extends to class DD
{
	String value ="This is M2 from inteface BB"; // By default variables in interface are static and final
	void m2(); // Methods in interface are public by default
				// Methods are abstract 
					// abstract methods have a definition but no body
	
}

interface CC
{
	String value2="This is M3 from inetrface CC"; // Be default variables in interface are static and final
	void m3(); // Method in interface are public by default
				// Methods are abstract
					// abstract methods have a definition but no body
}
class DD extends AA implements BB,CC
{
	void m4()
	{
		System.out.println("This is m4 from Class DD");
		
	}
	public void m2()
	{
		System.out.println(value);
	}
	
	public void m3()
	{
		System.out.println(value2);
	}
}
public class DemoHybrid {

	public static void main(String[] args) 
	{
		DD dd = new DD();
		dd.m1();
		dd.m2();
		dd.m3();
		dd.m4();
	}

}
