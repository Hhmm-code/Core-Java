import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        // String
        Scanner scan = new Scanner(System.in);
        String RCB = scan.nextLine();
        if (RCB.equals("WIN")) {
            System.out.println("RCB");
        } else {
            System.out.println("Not RCB");
        }
        // 2nd one
        String s1 = scan.nextLine();
        if (s1.equals("dead")) {
            System.out.println("Suriya meets Ramya");
        } else {
            System.out.println("Suriya weds Maghana");
        }
    }

}
