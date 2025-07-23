public class PrePostIncrement {
    public static void main(String[] args) {
        int i = 5;
        int result1, result2, result3, result4, result5;

        // Step-by-step evaluation with clear tracking
        result1 = i++;              // i used as 5, then becomes 6
        result2 = ++i;              // i becomes 7, then used
        result3 = i++ + ++i;        // 7 + 9 = 16 → i becomes 9
        result4 = i + i++;          // 9 + 9 = 18 → i becomes 10
        result5 = ++i + i++;        // 11 + 11 = 22 → i becomes 12

        // Print intermediate results
        System.out.println("Initial i = 5");
        System.out.println( result1);
        System.out.println(result2);
        System.out.println( result3);
        System.out.println( result4);
        System.out.println(result5);

        // Final value of i
        System.out.println("Final value of i = " + i);
    }
}
