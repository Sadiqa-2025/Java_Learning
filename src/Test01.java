public class Test01 {
    //write a program to check if Armstrong number- 153
    /*
    n= 153
    Find how many digits are there=3
    1*1*1 + 5*5*5 + 3*3*3 = 153 = result
    if (n==result) -> Armstrong number
     */
    public static void main(String[] args) {

        int original_number = 154;
        int n = original_number;
        int count = 0;
        int result = 0;
        // Logic for: Find how many digits are there=3
        while (n>0) {
            n = n / 10; //removing the last digit-  Assigning the result back to n - I am updating the value of n.
            count++;  //to find the number of digits
        }
        //Logic for 1*1*1 + 5*5*5 + 3*3*3 = 153 = result
        int n1= original_number;
        while (n1 >0){
            int eachDigit = n1 %10; // 3 (To get the last digit)
            result += (int) Math.pow(eachDigit, count);
            n1 = n1/10; //To update the value of n1
        }
        //Logic for if (n==result) -> Armstrong number
       if(original_number == result){
           System.out.println("The given number is armstrong");
       }
       else{
           System.out.println("Not armstrong");
       }
    }
}
