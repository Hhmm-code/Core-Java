/*
                    ARRAY
    Sum of array
    
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   int[] num = new int[5];
	   int sum=0;
	   Scanner scan=new Scanner(System.in);
	   for (int i=0;i<5;i++){
	       System.out.println("Enter element value of "+i);
	       num[i] =scan.nextInt();
	       sum = sum +num[i];
	   }
	   System.out.println("Sum of array : "+sum);
	}
}

/
