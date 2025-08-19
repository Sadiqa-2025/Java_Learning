package StringPrograms;
/*
"Write a program to count number of upper case and lower case letter
String s = ""WelcomE to JavA AutomAtioN"""
 */
public class CountUpperLowercaseLetters {
    public static void main(String[] args) {
        String s = "WelcomE to JavA  AutomAtioN";
        int lowerCount = 0;
        int upCount = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i)) && s.charAt(i)!=' '){
                upCount++;
            } else if (Character.isLowerCase(s.charAt(i)) && s.charAt(i)!= ' ') {
                lowerCount++;
            }
        }

        System.out.println("lower case count is " + lowerCount);
        System.out.println("Upper case count is "+ upCount);
    }
}
