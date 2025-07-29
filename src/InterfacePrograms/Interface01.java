package InterfacePrograms;

public interface Interface01 {
    static int i=20;
    final int j= 30;
    void abstractMethod();
    static void staticMethod() {
        System.out.println("static method from Interface");
    }
    default void defaultMethod() {
        System.out.println("default method from interface");
    }

}
