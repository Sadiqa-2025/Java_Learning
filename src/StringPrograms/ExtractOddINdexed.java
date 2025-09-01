package StringPrograms;
/*
"Extract characters from a string at all odd index positions and put them into an array

String: ""programming""

Output: {'r','g','a','m','n','g'}"
 */
public class ExtractOddINdexed {
    public static void main(String[] args) {
        String s = "programming";
        String ext = "";
        int y=0;

        for(int i=0; i<s.length();i++){
            if(i%2!=0){
                ext = ext + s.charAt(i);
            }
        }
        char[] arr = new char[ext.length()];

        //put the values of ext in to array
        for(char x : ext.toCharArray()){
            System.out.print( arr[y]=x);
            System.out.print(" ");
            y++;
        }
    }
}
