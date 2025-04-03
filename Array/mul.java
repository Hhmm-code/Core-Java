/*
                    ARRAY
    Mul od any number
    
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter a number ");
	    int num= scan.nextInt();
	   for (int i=1;i<=10;i++){
	       System.out.println("2 *" + i+" = " + i*num);
	   }
	}
}