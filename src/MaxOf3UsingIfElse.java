public class MaxOf3UsingIfElse {
    public static void main(String[] args) {
        int a=2;
        int b=359;
        int c=99;
        int big1 = 0;
        int biggest = 0;
        // logic using if else
        /*if(a>b){
            big1 = a;
            if(a>c){
                biggest = a;
                System.out.println("biggest is "+ biggest);
            }
            else{
                System.out.println("biggest is "+ c);
            }

        }
        else{
            if(b>c){
                System.out.println("biggest is "+ b);
            }
            else{
                System.out.println("biggest is " + c);
            }
        }*/

        // logic using logical operator and else-if
  /*      if(a>b && a>c){
            System.out.println("biggest is " + a);
        } else if (b>a && b>c) {
            System.out.println("biggest is " + b);
        }
        else{
            System.out.println("biggest is " +c);
        }*/

        //logic using conditional operator
         biggest = (a>b) ? ((a>c)? (a):(c)) : ((b>c)?(b):(c));
        System.out.println("biggest is "+ biggest);
    }
}
