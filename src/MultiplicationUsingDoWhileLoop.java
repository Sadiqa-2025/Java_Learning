public class MultiplicationUsingDoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        skip:
        do {
            int j = 1;
            do {
                if((i*j)%7==0 && (i*j)>30)
                    break skip;
                System.out.print(i * j + " ");
                j++;
            } while (j <= 10);
            System.out.println(" ");
            i++;
        }while(i<=10);

    }
}
