package ArraysPrograms;
/*
"Find elements in an integer array whose sum of digits is even

Input: int[] arr = {10, 24, 36, 68, 92}

Output: {24, 68} (Sum of 2+4=6, 6+8=14; both even)"
 */
public class SumOfDigitsInArray {
    static int sum(int x){
        int sum=0;
        while(x>0){
            sum = sum + x%10;
            x=x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {10, 24, 36, 68, 92};
        for(int num : arr){
           if( sum(num)%2 == 0){
               System.out.println(num);
           }
        }
    }
}
