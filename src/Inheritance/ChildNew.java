package Inheritance;

public class ChildNew extends ParentNew {
    ChildNew(){
        System.out.println("from child");
    }

    public static void main(String[] args) {
        ChildNew obj =  new ChildNew();
    }
}
