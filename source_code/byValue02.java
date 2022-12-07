// byValue02.java
// rename to Main.java

package aloni.main; // check that the package name is correct

class WClass {
    int a;
    
    // constructors
    WClass (int input) { a = input; }
} // end of WClass
     
public class Main {
 
   public static void main(String[] args){

   WClass Num = new WClass(10);
   System.out.println(Num.a);
   
   increase(Num);
   System.out.println(Num.a);
   
} // end of main()
   

   static void increase(WClass x)
    {
        x.a += 1;
    }
   
} // end of class Main
