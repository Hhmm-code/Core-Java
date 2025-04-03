import java.util.Scanner;
public class Find {
    String evenOrOdd(int a){
        if (a % 2==0)
            return "Even";
        else    
            return "Odd";
    }
    public static void main (String[] args){
    Find f1 = new Find();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a int value ");
    String result=f1.evenOrOdd(scan.nextInt());
    
   System.out.println(result);
}
}