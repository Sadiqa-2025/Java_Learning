public class Constructor01 {
    int x,y,z;
    Constructor01() {
        System.out.println("Default constructor");
    }

    Constructor01(int a, int b) {
        System.out.println("2 Param constructor");
        System.out.println(this.x=a);
        System.out.println(this.y=b);

    }

    Constructor01( int a, int b, int z){
        System.out.println("Multi param constructor");
        System.out.println(this.x=a);
        System.out.println(this.y=b);
        System.out.println(this.z=z);
    }

    public static void main(String[] args) {
        Constructor01 obj = new Constructor01();
        Constructor01 obj1 = new Constructor01(10, 20);
        new Constructor01(30, 40, 50);
        System.out.println("Calling values direct from main");
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
    }

}
