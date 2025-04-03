class Main{
    String getName(String Name){
        return Name;
    }
    long getPhone(long num){
        return num;
    }
   public static void main (String[] args){
      Main m1 = new Main ();
      System.out.println(m1.getName("Hari"));
      long phone= m1.getPhone(98);
      System.out.println(phone);
   }
}