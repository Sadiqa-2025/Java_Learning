package AccessModifiers;
import HybridInheritance.ChildClass;


public class AccessModClass3 extends ChildClass {

    public static void main(String[] args) {
        AccessModClass1 obj =  new AccessModClass1();
        obj.defaultMethod();
        ChildClass ch = new ChildClass();
        //System.out.println(ch.protectedVariable);



    }
}
