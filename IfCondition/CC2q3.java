import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Color should be"+'\n'+"RED"+'\n' +"YELLOR"+'\n'+"GREEN");
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        if (s1.equals("RED"))
            System.out.println("Color is "+s1 +" -> STOP");
        else if (s1.equals("YELLOR"))
             System.out.println("Color is "+s1 +" -> GET READY");
        else if (s1.equals("GREEN"))
            System.out.println("Color is "+s1 +" -> GO");
	}
}