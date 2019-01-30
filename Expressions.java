
public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    /**********************************************************
     * 3 and 4 are added with sum 7       
     * 7 is divided by 5 with 1 the result of integer division
     * The value displayed is 1
     ***********************************************************/
    System.out.println((a + b) / c);   
    
    /**********************************************************
     * Because division has higher precedence, 4 is divided by 5 with 0 the result of integer division       
     * 3 is added to 0 with sum 3
     *  The value displayed is 3
     ***********************************************************/
    System.out.println(a + b / c);       
    
	//Adds 1 to the int a before evaluation
	//int a is now stored as 4 for future evaluations
	//The value displayed is 4
    System.out.println(++a);    

	//Subtracts 1 from the int a before evaluation
	//int a is now stored as 3 for future evaluations
	//The value displayed is 3
    System.out.println(--a);
	
	//Adds 1 to the int a after evaluation
	//int a is now stored as 4 for future evaluations
	//The value displayed is 3
    System.out.println(a++);      

	//Subtracts 1 from the int a after evaluation
	//int a is now stored as 3 for future evaluations
	//The value displayed is 4
    System.out.println(a--);
	
	//Adds 1 to the value of int a
	//The value displayed is 4
    System.out.println(a + 1);

	//Evaluates the remainder of int d divided by int c
	//Since 17 / 5 = 3 with remainder of 2, the value displayed is 2
    System.out.println(d % c);       
	
	//Evaluates the maximum number of times c can be multiplied and not be greater than d
	//since 5 * 3 = 15, the value displayed is 3
    System.out.println(d / c);   

    //Evaluates the remainder of int d divided by int b
	//Since 17 / 4 = 4 with remainder of 1, the value displayed is 1
    System.out.println(d % b);   
    
	//Evaluates the maximum number of times b can be multiplied and not be greater than d
	//since 4 * 4 = 16, the value displayed is 4
    System.out.println(d / b);       
	
	//Divides a by d because of the order of operations
	//Then adds the sum of (a/d) and b and d
	//The value displayed is 21
    System.out.println(d + a / d + b);   
    
	//Adds d and a
	//Then adds d and b
	//Divides the sum of d and a by the sum of d + b
	//The value displayed is 0
    System.out.println((d + a) / (d + b));       
	
	//Takes the square root of b (b is converted to a double)
	//The square root of b is 2
	//The value displayed is 2.0
    System.out.println(Math.sqrt(b));       
	
	//Raises a to the power of b (a and b converted to doubles)
	//The value displayed is 81.0
    System.out.println(Math.pow(a, b));  

	//Evaluates a negative unary value of a
	//Then takes the absolute value of the previous value
	//The value displayed is 3
    System.out.println(Math.abs(-a));
	
	//Returns the greater value between a and b when compared
	//b is greater
	//The value displayed is 4
    System.out.println(Math.max(a, b));    
  } 
} 