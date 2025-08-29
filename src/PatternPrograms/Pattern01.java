package PatternPrograms;
/*

*****
****
***
**
*

 */
public class Pattern01 {
    public static void main(String[] args) {
    for(int rows=1; rows<=5 ; rows++){
        //print stars
        for(int stars=5; stars>=rows; stars--){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
