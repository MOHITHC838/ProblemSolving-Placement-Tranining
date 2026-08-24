package Strings;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String input = "Mohith";
        char[] charArray = input.toCharArray();
        System.out.println("Before Reverse: "+Arrays.toString(charArray));

        int left =0;
        int right =charArray.length-1;
        while (left <= right) {
            char temp =  charArray[right];
            charArray[right]= charArray[left];
            charArray[left] = temp;
            left++;
            right--; 
        }
        System.out.println("After Reverse: "+Arrays.toString(charArray));
        
        

    }
}
