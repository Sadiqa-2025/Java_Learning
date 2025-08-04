package StringPrograms;

public class VowelsConsonants {
    public static void main(String[] args) {
        String s = "GoodMorningBadNight";
        int vCount = 0;
        int cCount = 0;
        for(int i=0; i<s.length() ; i++) {
            char ch = s.charAt(i); // Storing the current character in ch
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){  //Comparing it to any of the  vowels
                vCount++;          //incrementing the count whenever there is a match to vowel
            }
        }
        System.out.println("Number of vowels is " + vCount);
        for(int i=0; i<s.length() ; i++) {
            char ch = s.charAt(i);      //storing the current char in ch
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                cCount++;
            }
        }
        System.out.println("Number of Consonants is " + cCount);
    }
}
