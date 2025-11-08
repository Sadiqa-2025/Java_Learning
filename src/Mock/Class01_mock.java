package Mock;

public class Class01_mock extends Class02_Mock {
    Class01_mock(){
        System.out.println("child cons");
    }

    {
        System.out.println("child non static block");
    }

    public static void main(String[] args) {
        Class01_mock obj = new Class01_mock();
    }
}
