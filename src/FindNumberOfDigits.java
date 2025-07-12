public class FindNumberOfDigits {
    public static void main(String[] args) {
        int num = 00344500;
        int count =0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("The number of digits in the number is "+count);
    }
}
