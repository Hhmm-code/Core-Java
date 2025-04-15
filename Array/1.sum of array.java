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


// Array
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        System.out.println("Array");
        int [] arr1= new int[5];
        arr1[0]=5;
        arr1[1]=2;
        arr1[3]=5;
        arr1[4]=3;
        
        //1. to print array
        System.out.println(Arrays.toString(arr1));   // it is a static method of Arrays class
        
        for( int i =0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]);
        }
        System.out.println();
        //2. lenth of array
        System.out.println(arr1.length); //
    }
}
