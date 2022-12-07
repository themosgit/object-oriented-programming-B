// Method05.java
// rename to Main.java

package aloni.main; // check that the package name is correct
import java.util.Scanner;

public class Main {
  static int recursive(int a1) {
    if (a1 > 1) {
      return a1 * recursive(a1 - 1);
    } else {
      return 1;
    }
}
  
  
   public static void main(String[] args){

   Scanner inputObj = new Scanner(System.in);
   System.out.println("Give an integer:");

   int int01 = inputObj.nextInt();
   int result = recursive(int01);
   
   System.out.println("The result is: " + result);
   
}
} // end of class Main
