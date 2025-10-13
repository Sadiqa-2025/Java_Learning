package StringPrograms;
/*
write a code to print only repeated  word in a sentence
 */
public class RepeatedWordInSentence {
    public static void main(String[] args) {
        String s = "hello apple is an apple hello";
        String[] words = s.split(" ");
        for(int i=0; i< words.length; i++){
            String ch = words[i];
            for(int j=1; j< words.length; j++){
             if(ch.equals(words[j]) && i!=j){
                 System.out.println(ch);
             }
            }
        }
    }
}
