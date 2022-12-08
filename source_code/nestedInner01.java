// nestedInner01.java
//

package aloni.main;

// outer class
class theClass
{
    // member
    int x = 1;
     
    // static nested class
    class InnerClass
    {
        void show()
        {
            // can access static member of outer class
            // if the member is not static, ther will be
            // a compilation error
            System.out.println("x = " + x);         
        }
    }
}
 
// Driver class
public class Main
{
    public static void main(String[] args)
    {
        // access the (static) nested class
        theClass Obj = new theClass();
        theClass.InnerClass innerObj = Obj.new InnerClass();
         
        innerObj.show();
         
    }
}
