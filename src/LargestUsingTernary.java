import java.util.Scanner;

public class LargestUsingTernary {
    /*
    "Take 3 integer inputs from user and print the largest number
------------   write a program logic using ternary operator"
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num");
    int firstNum = scanner.nextInt();
        System.out.println("Enter second num");
    int secondNum = scanner.nextInt();
        System.out.println("Enter third num");
    int thirdNum = scanner.nextInt();
      int largest=  (firstNum>secondNum) ? ((firstNum>thirdNum)? firstNum: thirdNum) : ((secondNum>thirdNum)? secondNum: thirdNum);
        System.out.println(largest);
    }
}
