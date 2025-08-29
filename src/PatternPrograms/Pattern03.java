package PatternPrograms;
/*

   *         space= 4  stars= 1
  * *               3         2
 * * *              2         3
* * * *             1         4

 */
public class Pattern03 {
    public static void main(String[] args) {
        for(int rows=1; rows<=5; rows++){
            //print spaces
            for(int space=5; space>=rows; space--){
                System.out.print(" ");
            }
            //print stars
            for(int stars=1; stars<=rows; stars++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
