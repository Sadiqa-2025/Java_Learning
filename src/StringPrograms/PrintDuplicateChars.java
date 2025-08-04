package StringPrograms;

public class PrintDuplicateChars {

    public static void main(String[] args) {
        String s = "Programming";
        for(int i=0; i< s.length(); i++){
            int count = 1;  // initialising a count for each character occurence
            for(int j=1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    count++;
                }
            }
             // System.out.println(s.charAt(i) + " --count is " + count); //prints the count for each character
            if (count >1){
                System.out.println(s.charAt(i) + "--count is " + count);
            }
        }

    }
}
