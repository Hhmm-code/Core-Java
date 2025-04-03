import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int salary = scan.nextInt();
	    int age =scan.nextInt();
	    if (salary >= 20000 || age <= 20){
	        System.out.println("Loan amount");
	        int amount = scan.nextInt();
	        if (amount > 50000){
	            System.out.println("Maximum loan amount is 50000");
	        }else{
	            System.out.println("loan available");
	        }
	    }
	    else{
	        System.out.print("Not elegble");
	        
	    }
	}
}