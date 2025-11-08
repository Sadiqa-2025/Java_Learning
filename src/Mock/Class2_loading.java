package Mock;

public class Class2_loading implements Class3_Interface {
    static int z= 1;
    Class2_loading(){
        this(20);
        System.out.println("default class2 cons");
    }

    Class2_loading(int m){
        System.out.println("param class 2 cont");
    }

    static void m02(){
        System.out.println("method in class2");
    }

   public void m03(){
        System.out.println("non static in class2");
    }

    public static void main(String[] args) {
      Class3_Interface.m04();
    }
}
