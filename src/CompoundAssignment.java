public class CompoundAssignment {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n+=2); //n = 10+2= 12
        System.out.println(n-=2); // n = 12-2 = 10
        System.out.println(n/=2); // n = 10/2=5
        System.out.println(n*=4); //n = 5*4 =20
        System.out.println(n%=3);// n= 20%3--> remainder 2
    }
}
