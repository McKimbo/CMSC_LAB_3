public class VariableDefinitions
{
	public static void main(String[] args)
	{
		System.out.println("Christian Kim and Ashley Beasley, section 003");
		/* ***********************
		*initial declaration of variables
		***************************/
		
		byte numPeople = 3;
		double itemPrice = 32.32;
		boolean flagValue = false;
		char dataValue = 'a';
		
		System.out.println("The numPeople variable has a value of " + numPeople);
		System.out.println("The itemPrice variable has a value of " + itemPrice);
		System.out.println("The flagValue variable has a value of " + flagValue);
		System.out.println("The dataValue variable has a value of " + dataValue);
		
		//Modified value of numPeople,itemPrice, flagValue, dataValue variables
		numPeople = 9;
		itemPrice = 40.12;
		flagValue = true;
		dataValue = 'b';
		
		/**************
		*printing the modified variables
		***************/
		
		System.out.println("The numPeople variable has a value of " + numPeople);
		System.out.println("The itemPrice variable has a value of " + itemPrice);
		System.out.println("The flagValue variable has a value of " + flagValue);
		System.out.println("The dataValue variable has a value of " + dataValue);
		
		
		final int dogs = 3;
		final char cats = 'a';
		final String house = "green";
		final double tax = 0.05;
		
		System.out.println("The dogs variable has a value of " + dogs);
		System.out.println("The cats variable has a value of " + cats);
		System.out.println("The house variable has a value of " + house);
		System.out.println("The tax variable has a value of " + tax);
		
		
		//dogs = 43;
		
		
		
	}	
}