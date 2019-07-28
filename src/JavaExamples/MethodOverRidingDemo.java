package JavaExamples;

// Method Over riding 

		// We need one child class and one parent class only then method over riding is possible

			// In method overloading the definition is not changed only the body is
			// In over riding we use inheritance 

			// Rule of method over riding 
				// Method must have same name as the parent class
				// Method must have the same parameter as the parent class
				// Body of the method changes


class Bank 
{
	double rateOfInterest()
	{
		return 0;
	}
}
// Use of inheritance 
// In method over riding there should be a Parent class and a child class
class SBI extends Bank
{
	double rateOfInterest() // Method over riding the methods are same
	{
		return 10.5; // Method over riding the body changes 
	}
}
class Axis extends Bank // Method over riding the methods are same
{
	double rateOfInterest()
	{
		return 12.5;// Method over riding the body changes 
	}
	
}
public class MethodOverRidingDemo {

	public static void main(String[] args) 
	{
		// Since the method is return type 
		// we need to pass it into a variable and then display the result
		Bank bank = new Bank();
		double result  = bank.rateOfInterest();
		System.out.println(result);
		
		SBI sbi = new SBI();
		double result1 = sbi.rateOfInterest();
		System.out.println(result1);
		
		Axis axis = new Axis();
		double result2 = axis.rateOfInterest();
		System.out.println(result2);
		
		
	}

}
