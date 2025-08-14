package StringPrograms;
/*
"Write a program to generate below patterns:
1
12
123
1234
12345

Note: No array/Collection should be used."
 */
public class NumberPattern {
    public static void main(String[] args) {
        System.out.println("1");
        int count=1;
        String res = "1";
        for(int i=0; i<5; i++){
            res = res + ++count;
            System.out.println(res);
        }
    }
}
