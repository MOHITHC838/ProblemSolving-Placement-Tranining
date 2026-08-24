package Strings;

public class countCharcter {
    public static void main(String[] args) {
        String input  = "banana";
        char target = 'a';
        int count =0;

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (ch == target) {
                count++;
                
            }
           
        }
        System.out.println(count);
    }
}
