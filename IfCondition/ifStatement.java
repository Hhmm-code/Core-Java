import java.util.Scanner;

public class ifStatement {
    public static void main(String args[]) {
        boolean rain = false;
        if (rain) {
            System.err.println("It't raining outsite");
        } else {
            System.out.println("No, not raining");
        }

        //2nd question
        Scanner s1=new Scanner(System.in);
        int num1=s1.nextInt();
        int num2=s1.nextInt();
        if (num1 > num2){
            System.err.println("Num 1 is greater");
        }
        else{
                System.err.println("Num2 is greater");
        }
    }
}
