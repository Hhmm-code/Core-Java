/******************************************************************************
                            Constructor 
    * It is a special method in java which is used to initialize objects.
    * It is called when an object of a class is created.   
	* It is also a mthod only 

*******************************************************************************/

public class Main
{
    int num1;
	public static void main(String[] args) {
// 		int num;
// 		    System.out.println(num);     //error: variable num might not have been initialized
    Main m1= new Main();                // calling the Constructor
    System.out.println(m1.num1);        // Constructor is initializeing the variable
		
	}
}