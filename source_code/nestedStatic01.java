// nestedStatic01.java
//

package aloni.main;

class theClass
{
    // static member
    static int x = 1;
     
    // static nested class
    static class nestedClass
    {
        void show()
        {
            // can access static member of outer class
            // if the member is not static, ther will be
            // a compilation error
            System.out.println("x = " + x);         
        }
    } // end of nestedClass
} // end of theClass 
 
// Main class
public class Main
{
    public static void main(String[] args)
    {
        // access the (static) nested class
        theClass.nestedClass Obj = new theClass.nestedClass();
         
        Obj.show();
         
    }
} // end of Main class
