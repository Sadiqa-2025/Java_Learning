package Mock;

public class Class_Loading extends Class2_loading implements Class3_Interface {
    int x=10;
    static int y=20;
    static void static_m(){
        System.out.println("statuic");
    }

    void nonstatic(){
        System.out.println("non static");
    }

    {
        System.out.println("IIB");
    }
    static {
        System.out.println("SIB");
    }

    Class_Loading(){
        System.out.println("default cons");
    }

    Class_Loading(int n){
        super(12);
        System.out.println("parameterized cons");
    }

    public void m03(){
        System.out.println("overridden in 1st class");
    }

    public static void main(String[] args) {
        //in what all ways we can use the variable x?,obj.x and obj2.x
        //directly we cant access and usign interface name we cant.
        // in what all ways we can access m04 method?
        //we can access static method usign interface name directly and using object(obj1 and obj2)
      Class_Loading obj = new Class_Loading();
      Class2_loading obj2 = new Class_Loading(10);
      Class3_Interface obj3 = new Class_Loading();
      // using obj , obj2 and obj3 what all methods i can access aloang with output.
        // using obj , obj2 and obj3 what all variables i can access.
        //output of the program

    }
}
