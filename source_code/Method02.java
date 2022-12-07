// Method02.java
// rename to Main.java

package aloni.main; // check that the package name is correct
import java.util.Scanner;

public class Main {
  static void showName(String input) {
      System.out.println("Your name is: " + input);
}
  
   public static void main(String[] args){

   Scanner inputObj = new Scanner(System.in);
   System.out.println("Enter your name:");

   // name input
   String name = inputObj.nextLine();    
       
   showName(name);
}
} // end of class Main
