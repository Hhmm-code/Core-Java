import java.util.Scanner;

public class cc2Part1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if (mark > 32) {
            System.out.println("pass");

        } else {
            System.out.println("fail");
        }

        // 3rd question
        int a = scan.nextInt();
        if (a % 3 == 0 && a % 5 == 0) {
            System.err.println("The given number " + a + "is divisible by both 3 and 5");
        } else {
            System.err.println("The given number " + a + "is not divisible by either 3 and 5");
        }

        // 4th question
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Not even");
        }
    }

}
