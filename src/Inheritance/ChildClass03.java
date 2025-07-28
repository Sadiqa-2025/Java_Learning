package Inheritance;

public class ChildClass03 {
    static{
        System.out.println("CHild class 03 SIB");
    }
    {
        System.out.println("Child class 03 IIB");
    }
    void nsChild03() {
        System.out.println("non static method of child class 03");
        nsChild04();
    }

    static void child03() {
        System.out.println("static method of child class 03");
    }

    void nsChild04() {
        System.out.println("New method");
    }

    public static void main(String[] args) {
        ChildClass03 obj4 = new ChildClass03();
        child03();
       /* child02();
        child01();*/
        obj4.nsChild03();
      /*  obj4.nsChild02();
        obj4.nsChild01();
*/
    }
}
