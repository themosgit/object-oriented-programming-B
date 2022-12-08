// nestedAnonymous01.java
//

package aloni.main;

// a simple class
class Xmas{  
  void eat(){ System.out.println("I like melomakarona"); }  
}  

class Main{
    
    public static void main(String args[]){  
        
        // implementing anonymous nested class
        Xmas Obj = new Xmas(){  
            void eat(){System.out.println("Kourambiedes for ever!!");}  
        };  
        Obj.eat();  
        
    } // end of main()
    
} // end of class Main
