public class Constructor02 {
    int a;
    String s;
    Constructor02( int x) {
        System.out.println("One param constructor");
        System.out.println(this.a=x);
    }

    Constructor02(int x, int y) {
        this(10);        // Constructor calling with 1 param
        System.out.println("two param constructor");
        System.out.println(this.a=x);
        System.out.println(this.a=y);
    }

    Constructor02(String s1) {
        this(20, 30);  // constructor calling with 2 param
        System.out.println("Constructor chaining");
    }

    public static void main(String[] args) {
        Constructor02 obj1 = new Constructor02(20);
        new Constructor02("HHello");
    }
}
