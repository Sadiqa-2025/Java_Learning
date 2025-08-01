package AccessModifiers;

public class AccessModClass2 extends  AccessModClass1{

    public static void main(String[] args) {
        AccessModClass2 obj3 = new AccessModClass2();
        System.out.println(obj3.x);
        System.out.println(obj3.pro);
        // obj3.privateMethod(); // private can be accessed only in the same created class
        obj3.protectedMethod();
    }
}
