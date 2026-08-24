package Strings;

import java.util.*;

public class replaceCharacter {
    public static void main(String[] args) {
        String input = "banana";
        char[] ch = input.toCharArray();
        int left =0;
        while (left <= ch.length-1) {
            if (ch[left] != 'a') {
                left++;
            }else{
                ch[left] = 'o';
                left++;
            } 
        }
        System.out.println(Arrays.toString(ch));


    }
}
