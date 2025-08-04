package StringPrograms;

public class CountWordsInString {
    public static void main(String[] args) {
        String s = "These are the months in an year";
        String[] words = s.split(" ");
        System.out.println("The number of words in above string is " + words.length);
    }
}
