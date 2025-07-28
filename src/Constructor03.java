public class Constructor03 extends Constructor01 {

    Constructor03(int x) {
        super(10, 20);
        System.out.println("Constructor from Child class");
    }
    public static void main(String[] args) {
        Constructor03 obj = new Constructor03(10);
    }
}
