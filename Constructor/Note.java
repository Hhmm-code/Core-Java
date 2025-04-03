/******************************************************************************
                            Constructor 
    * Constructor name and class name always same
	* For a class if we create muliple objecs , for each time Constructor is called . check line 22&23

*******************************************************************************/

public class Main
{
    int num;
    int num1=100;
    // num=100;                                                                     not allowed
    Main (){
        num1=10;
        // num=100;                                                                 here only allowed
        System.out.println("Hello");
    }
    // num=100;                                                                     not allowed here
    int num2=5;
	public static void main(String[] args) {

    Main m1= new Main();      
    Main m2= new Main();  
    System.out.println(m1.num);
    System.out.println(m1.num1);        
	System.out.println(m1.num2)	;
	
	}
}