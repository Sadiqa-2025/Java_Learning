package StringPrograms;
/*
 input: String s = ""abbccddeff";
 output: a"
 */
public class NonRepLogic03 {
    public static void main(String[] args) {
        String s = "accddaeff";
        int count=0;
        int[] array = new int[127];  //ascii value range
        for(int i=0; i<s.length();i++){ //store teh values of string into array for eh characters of string.
           array[s.charAt(i)]++; // b
        }

        for(int i=0; i<s.length(); i++){
            if( array[s.charAt(i)]==1){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
