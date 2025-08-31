package StringPrograms;
/*
"Java program to print unqiue characters
    Enter a string: Java Automation
    Unique characters in ""Java Automation"":
    Output : J a v A u t o m i n"
 */
public class UNiqueChars {
    public static void main(String[] args) {
        String s = "Java Automation";
        String unique = "" + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            boolean present = false;
            for (int j = 0; j < unique.length(); j++) {
                if (s.charAt(i) == unique.charAt(j)) {
                    present = true;
                    break;
                }
            }
            if(!present){
                unique = unique + s.charAt(i);
            }
        }
        System.out.println(unique);
    }
}
