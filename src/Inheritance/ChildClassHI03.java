package Inheritance;

public class ChildClassHI03 extends ParentClass001{
    void method03() {
        System.out.println("Child class 03");
    }

    public static void main(String[] args) {
        ChildClassHI03 obj = new ChildClassHI03();
        obj.method1();
        obj.method03();
        ChildClassHI02 obj1 = new ChildClassHI02();
        obj1.method1();

    }
}
