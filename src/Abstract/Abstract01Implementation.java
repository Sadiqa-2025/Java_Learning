package Abstract;
import AccessModifiers.AccessModClass1;
public class Abstract01Implementation extends AbstractClass01{

    public void abstractMethod() {
        System.out.println("Implementation for abstract method");
    }

    Abstract01Implementation() {
        super();
    }
    public static void main(String[] args) {
        Abstract01Implementation obj = new Abstract01Implementation();
        method();
        System.out.println(obj.j);
        obj.abstractMethod();
       // System.out.println(obj.publicVar);
        AccessModClass1 obj1 = new AccessModClass1();
        System.out.println(obj1.publicVar);
    }
}
