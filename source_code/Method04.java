// Method04.java
// rename to Main.java
// method overloading

package aloni.main; // check that the package name is correct
import java.util.Scanner;

public class Main {
  static int add(int a1, int a2) {
      return a1 + a2;
}
  
  static float add(float a1, float a2, float a3) {
      return a1 + a2 + a3;
}
  
   public static void main(String[] args){

   Scanner inputObj = new Scanner(System.in);
   System.out.println("Give two integers:");

   // number input
   int int01 = inputObj.nextInt();
   int int02 = inputObj.nextInt();
   
   int result = add(int01, int02);
   
   System.out.println("The integer result is: " + result);
   
   
   System.out.println("Give three float numbers:");

   // name input
   float f01 = inputObj.nextFloat();
   float f02 = inputObj.nextFloat();
   float f03 = inputObj.nextFloat();
   
   float resultF = add(f01, f02, f03);
   
   System.out.println("The float result is: " + resultF);
}
} // end of class Main
