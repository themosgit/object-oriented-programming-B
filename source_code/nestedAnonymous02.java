// nestedAnonymous02.java
//

package aloni.main;

class Santa {
   public void say() {
      System.out.println("Ho ho ho!!!");
   }
}

class Kalikantzaros {
   public void nestedClass() {

      // creation of anonymous class extending class Polygon
      Santa notRealSanta = new Santa() {
         public void say() {
            System.out.println("I hate New Year's Eve...");
         }
      };
      notRealSanta.say();
   }
}

class Main {
   public static void main(String[] args) {
       Kalikantzaros kal01 = new Kalikantzaros();
       kal01.nestedClass();
   }
}
