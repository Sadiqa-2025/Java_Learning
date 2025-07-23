package Inheritance;

public class ChildClass01 extends ParentClass01 {
    int b= 20;
    {
        System.out.println("Child class 01 IIB");
    }

    static{
        System.out.println("CHild class 01 SIB");
    }

    void nsChild01() {
        System.out.println("non static method of child class 01");
    }

    static void child01() {
        System.out.println("static method of child class 01");
    }

    public static void main(String[] args) {
        ChildClass01 obj2 = new ChildClass01();
        System.out.println(obj2.b);
    }
}
