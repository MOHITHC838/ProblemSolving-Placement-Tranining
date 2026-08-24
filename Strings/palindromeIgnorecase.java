package Strings;

public class palindromeIgnorecase {
    public static void main(String[] args) {
        String input = "MAdam";
        String rev = "";

        for(int i=input.length()-1; i>=0;i--){
            rev +=input.charAt(i);
        }
        if (input.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome String");    
        }else{
            System.out.println("Not a palindrome String");
        }
       
    }
}
