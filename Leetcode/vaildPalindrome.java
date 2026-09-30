package Leetcode;

import java.util.Arrays;

public class vaildPalindrome {
    static void main(String[] args) {
        String inp = "A man canel man";
          palindrome(inp);
    }
    static  boolean palindrome(String input){
        int left = 0;
        int right = input.length()-1;

        while(left < right){
            char l = input.charAt(left);
            char r = input.charAt(right);


            if (!(l >='a' && l<='z' )|| (l>='A' && l<='Z')){
                left++;
                continue;
            }
            if (!((r >='a' && r <='z') || (r>='A' && r<='Z'))){
                right--;
                continue;
            }
            if (l >= 'A' && l<='Z'){
                l = (char)(l+32);
            }

            if (r >= 'A' && r<='Z'){
                r = (char)(r+32);
            }

            if (l != r){
                System.out.println("Not a Palindrome");
                return false;
            }
            left++;
            right--;
        }
        System.out.println(" Palindrome");
        return true;

    }

}
