package PatternPrograms;

public class Pattern02 {
    public static void main(String[] args) {
        for(int rows=1; rows<=5; rows++){
            for(int up=1; up<=rows; up++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int rows=1; rows<=4; rows++){
            for(int down=4; down>=rows; down--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
