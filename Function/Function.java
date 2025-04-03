/*
        Function
    syntax :
                        void <fnctionName>(ARGUMENT){
                            Function body
                        }
    
*/



/*
        public static void main(String[] args)
        this is also a function only 
        where 
            public          -> access specifier
            static          -> static
            void            -> its a datatype (void means the function wuill not return any value )
            main            -> function  name 
            (String[] args) -> argument
            
*/

/*
        calling Function : 
                        <objectName>.<functionName>(argument);              // static  to non static function
                                    <or>
                            <functionName>(argument);                       // static to static function
        * Main is static function . SO for a static function if we try to call a not staic fuction(welcome is a not static ) we need to create an Object for calling the funnction
        *From a static function we are trying to call another static function no need to create objec.
*/

public class Main{
    void welcome(){
        System.out.println("WELCOME");
    }
     
    static void fun1(){
        System.out.print("Message");
    }
    
    public static void main(String[] args){
        Main m1=new Main();
        m1.welcome();
        fun1();
    }
}