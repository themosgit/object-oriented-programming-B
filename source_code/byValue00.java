// byValue00.java
// rename to Main.java

package aloni.main; // check that the package name is correct

public class Main {
 
   public static void main(String[] args){

   int num = 10;   
   System.out.println(num);
   
   increase(num);
   System.out.println(num);
   
}
   
   // public static void alter(int x)
   static void increase(int x)
    {
        x += 1;
    }
   
} // end of class Main
