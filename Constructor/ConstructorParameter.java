public class Main{
// 	System.out.println("Start of Main program ");
	Main(){
		System.out.println("No parameter");
	}
	
	Main(int a){
		System.out.println("Single parameter");
		System.out.println(a);
	}
// 	System.out.println("End of Main program ");
	public static void main (String[] args){
		Main m1 = new Main (10);
		Main m2 = new Main ();
		System.out.println("calling the Main con");
		
	}
}