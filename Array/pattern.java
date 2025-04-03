/*
            pattern
    
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.println(" methon 1");
	    for (int i =0;i<3;i++){
	        for(int j=0;j<3;j++){
	            System.out.print("* ");
	        }
	        System.out.println(" ");
	    }
	    
	    //2 nd pattern
	    System.out.println(" method 2");
	    for (int j=0;j<3;j++){
	    for(int i=0;i<=j;i++){
	        System.out.print("* ");
	    }
	    System.out.println(" ");
	    }
	    
	    //3rd method
	    System.out.println(" method 3");
	    for (int j=5;j>=1;j--){
	        for (int i=1;i<=j;i++){
	            System.out.print("* ");
	        }
	         System.out.println(" ");
	    }
	    //4th method
	    System.out.println(" method 4");
	    for (int j=1;j<=5;j++){
	        for (int i=1;i<=j;i++){
	            System.out.print("* ");
	        }
	        System.out.println(" ");
	    }
	    for (int j=4;j>=1;j--){
	        for (int i=1;i<=j;i++){
	            System.out.print("* ");
	        }
	         System.out.println(" ");
	    }
	    
	    //5th method
	    System.out.println(" method 5");
	    for (int i =1;i<=5;i++){
	        for(int j=4;j>=i;j--){
	            System.out.print(" ");
	        }
	        for (int k=1;k<=i;k++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	}
}