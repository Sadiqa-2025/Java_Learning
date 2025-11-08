package StringPrograms;

public class PrintDuplicateChars {

    public static void main(String[] args) {
        String s = "Programmmmmming";
        for(int i=0; i< s.length(); i++){
            int count = 1;  // initialising a count for each character occurence
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
             // System.out.println(s.charAt(i) + " --count is " + count); //prints the count for each character
            if (count >1){ // duplicate character
                System.out.println(s.charAt(i) + "--count is " + count);
                s = s.replace(Character.toString(s.charAt(i)),"");
            }
        }

    }
}
