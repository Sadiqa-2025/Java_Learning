package AccessModifiers;

public class AccessModClass1 {
    int x=10;
    public int publicVar = 15;
    private int z= 30;
    protected int pro = 25;

    void defaultMethod() {
        System.out.println("default method");
    }
     public void publicMethod() {
         System.out.println("public method ");
     }

     private void privateMethod() {
         System.out.println("private method");
     }

     protected void protectedMethod() {
         System.out.println("protected method");
     }

    public static void main(String[] args) {
        AccessModClass1 obj = new AccessModClass1();
        System.out.println(obj.x); // default can be used in same package
        System.out.println(obj.pro); //protected in same package with inheritance
        System.out.println(obj.publicVar);
        obj.defaultMethod(); // we can access all 4 types of methods here

    }

}
