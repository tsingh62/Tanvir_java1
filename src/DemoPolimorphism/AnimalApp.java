package DemoPolimorphism;

public class AnimalApp {

	public static void main(String[] args) 
	{
	//	Animal myAnimal = new Bird();
	//	myAnimal.move(); // prints flying method from Bird
		
		Animal[] Animals =  {new Animal(), new Bird(), new Fish()};
		
		for (Animal a: Animals)
		{
			a.move();
		}
		
		Animal ani = new Bird();
		ani.move();
		
	}

}
