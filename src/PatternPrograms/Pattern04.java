package PatternPrograms;

public class Pattern04 {
    public static void main(String[] args) {
        for(int rows=1; rows<=5; rows++){
            for(int space=5; space>=rows; space--){
                System.out.print(" ");
            }
            for(int stars=1; stars<=rows; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
