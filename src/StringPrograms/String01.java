package StringPrograms;

public class String01 {
    public static void main(String[] args) {
        String s ="aBACbcEDed";
        String low = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z') {
                low = low + s.charAt(i);
            }
        }

        System.out.println(low);
}
}



