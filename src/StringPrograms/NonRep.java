package StringPrograms;

public class NonRep {
    public static void main(String[] args) {
        // String s = "abbccddeff";
        String s = "abbcacddef";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int count=1;
            for(int j=0; j<s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                   count++;
                }
            }
            if(count ==1){
                System.out.println(s.charAt(i));
                break;
            }

        }
    }

}
