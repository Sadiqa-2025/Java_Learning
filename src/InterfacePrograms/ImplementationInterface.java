package InterfacePrograms;

public class ImplementationInterface implements Interface01{

    public void abstractMethod() {
        System.out.println("Implementation of abstract method");
    }

    public static void main(String[] args) {
        Interface01 obj = new ImplementationInterface();
        obj.defaultMethod();
        obj.abstractMethod();
        Interface01.staticMethod();
        System.out.println(Interface01.i);
        System.out.println(Interface01.j);
    }
}
