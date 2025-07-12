public class MultiplicationUsingWhileLoop {
    public static void main(String[] args) {
        int i=1;


        skip:
        while(i<=10) {
            int j=1;
            while (j <=10) {
                if ((i * j) % 7 == 0 && (i * j) > 30)
                    break skip;
                System.out.print(i * j + "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
