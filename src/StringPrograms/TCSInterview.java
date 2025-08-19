package StringPrograms;
/*
"Write a java code
input- This is a tcs interview
output- weivretni tcs a si sihT"
 */
public class TCSInterview {
    public static void main(String[] args) {
        String s = "This is a tcs interview";
        String t = "tcs";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder("");

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].equals(t)) {
                result.append(words[i]).append(" ");
            } else {
                StringBuilder temp = new StringBuilder(words[i]);
                result.append(temp.reverse()).append(" ");
            }

        }
        System.out.println(result);
    }
}
