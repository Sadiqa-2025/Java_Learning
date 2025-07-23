package Inheritance;

public class ChildClass02 extends ChildClass01 {
    static{
        System.out.println("CHild class 02 SIB");
    }
    {
        System.out.println("Child class 02 IIB");
    }
    void nsChild02() {
        System.out.println("non static method of child class 02");
    }

    static void child02() {
        System.out.println("static method of child class 02");
    }

    public static void main(String[] args) {
        ChildClass02 obj3 = new ChildClass02();
    }
}
