package Strings;

public class palindromeString {
    public static void main(String[] args) {
        String input = "Madam";
        String reverse = "";
        for(int i=input.length()-1;i>=0;i--){
            reverse +=input.charAt(i);
        }
        if (input.equals(reverse)) {
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not a Palidrome String");
        }
    }
}
