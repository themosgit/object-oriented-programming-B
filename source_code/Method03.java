// Method03.java
// rename to Main.java

package aloni.main; // check that the package name is correct
import java.util.Scanner;

public class Main {
  static int add(int a1, int a2) {
      return a1 + a2;
}
  
   public static void main(String[] args){

   Scanner inputObj = new Scanner(System.in);
   System.out.println("Give two integers:");

   // name input
   int int01 = inputObj.nextInt();
   int int02 = inputObj.nextInt();
   
   int result = add(int01, int02);
   
   System.out.println("The result is: " + result);
}
} // end of class Main
