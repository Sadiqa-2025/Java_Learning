public class MultiplicationUsingForLoop {
   /*
   1s table
   2s table
   3s table
   4s table
   5s table up to 30
    */
    public static void main(String[] args) {
        skip:
        for(int i=1; i<=10; i++){
            for(int j= 1; j<=10; j++){
                if((i*j)%7==0 && (i*j)>30)
                    break skip;
                System.out.print(i*j + "  ");
            }
            System.out.println();
        }
    }
}
