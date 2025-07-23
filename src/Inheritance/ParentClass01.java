package Inheritance;

public class ParentClass01 {

    int a = 10;
    {
        System.out.println("Parent class IIB ");
    }

    static{
        System.out.println("Parent class SIB");
    }

    void nSParentMethod(){
        System.out.println("Non static method from Parent");
    }

    static void sParentMethod() {
        System.out.println("Static method from Parent");
    }

    public static void main(String[] args) {
        ParentClass01 obj1 = new ParentClass01();
        System.out.println(obj1.a);
    }
}
