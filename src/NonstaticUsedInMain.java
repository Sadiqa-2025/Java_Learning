public class NonstaticUsedInMain {
    int x=10;
    String s = "Non static";

    public static void main(String[] args) {
       // System.out.println(x);// Can not be accesses directly
        NonstaticUsedInMain obj = new NonstaticUsedInMain(); //Object creation
        System.out.println(obj.x);
        System.out.println(obj.s);
        obj.x=15;               //Updated the value of x using first object
        obj.s = "Updated String";  //Updated teh value of s using first object
        System.out.println(obj.x);
        System.out.println(obj.s);
        NonstaticUsedInMain obj2 = new NonstaticUsedInMain();
        obj2.x= 20;                //Updated the value of x using second object
        System.out.println(obj.x);   // accessed teh value of x using first object
        System.out.println(obj2.x);   // accessed teh value of x using second object
    }
}
