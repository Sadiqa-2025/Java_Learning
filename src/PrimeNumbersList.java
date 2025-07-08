public class PrimeNumbersList {
    public static void main(String[] args) {
        for(int j=2; j<=100; j++){
            boolean isPrime = true;
            for(int i=2; i<j; i++){
                if(j%i==0){
                    isPrime = false;
                    break;

                }
            }
            if(isPrime == true){
                System.out.println(j + " is a prime number");
            }
        }
    }
}
