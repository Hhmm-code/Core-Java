public class Laptop{
    String name="";
    int ram=0;
    float price= 0.0f;
    
    
    public static void main(String[] args){
        Laptop lap1 = new Laptop();
        lap1.name="Acer";
        lap1.ram=8;
        lap1.price =1000.91f;
        
        System.out.println(lap1.price);
        lap1.price =10002.91f;
        System.out.println(lap1.price);
        
        Laptop lap2 = new Laptop();
        System.out.println(lap2.price);
    }
}
