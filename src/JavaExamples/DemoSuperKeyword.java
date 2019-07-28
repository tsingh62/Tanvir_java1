package JavaExamples;

// Super can be used to refer immediate parent class - instance variable
// Super can be used to invoke immediate parent class method
 class Animal
{
	 String color = "white";
		
		void eating()
		{
			System.out.println("Eating......");
		}
	
}

 // Super key word is implemented in the child class
class Dog extends Animal
{
	String color ="Black";
	void eating()
	{
		System.out.println("Eating bread....");
		super.eating(); // Super keyword is implemented in the child class
						// and it refers to the immediate parent
	
		
	//	System.out.println(super.color);//Super keyword is implemented in the child class
										// and it refers to the immediate parent
	//	System.out.println(color);
	}
}



public class DemoSuperKeyword 
{
	
	public static void main(String[] args) 
	{
		Dog dog = new Dog();
		dog.eating();
		
	}

}
