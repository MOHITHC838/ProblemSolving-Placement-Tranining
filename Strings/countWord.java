package Strings;

import java.util.*;

public class countWord {
    public static void main(String[] args) {
        String input = "learn Java daily and pratice";
        String[] stringArray = input.split(" ");
        int count =0;
        for(int i=0;i<=stringArray.length-1;i++){
            count++;

        }
        System.out.println(count);

    
    }
    
}
