package Logical_Patterns;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value ");
        int value =s.nextInt();
        System.out.println("printed "+ value);
        System.out.println("Enter string value");
        String s1 = s.next();
        System.out.println("printing string  "+ s1);

    }
}
