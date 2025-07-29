package Abstract;

public abstract class AbstractClass01 {
    int j;
    static void method() {
        System.out.println("Abstract class concrete method");
    }

    abstract void abstractMethod();

    AbstractClass01(){
        System.out.println("Constructor in abstract class");
        System.out.println(this.j);
    }
}
