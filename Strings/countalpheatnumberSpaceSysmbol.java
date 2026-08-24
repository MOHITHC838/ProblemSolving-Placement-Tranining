package Strings;

import java.util.*;

public class countalpheatnumberSpaceSysmbol {
    public static void main(String[] args) {
        String input = "Ab3 @!";
        char[] ch = input.toCharArray();
        int alpheatCount =0;
        int digitCout=0;
        int spaceCount =0;
        int simpleCount=0;
        for(int i=0;i<=ch.length-1;i++){
            char temp = input.charAt(i);
            if (Character.isAlphabetic(temp)) {
                alpheatCount++;   
            }else if (Character.isDigit(temp)) {
                digitCout++;    
            }else if (Character.isSpaceChar(temp)) {
                spaceCount++;  
            }else{
                simpleCount++;
            }
        }
                System.out.println("Letter: " +alpheatCount);
                System.out.println("Digit " +digitCout);
                System.out.println("Space " +spaceCount);
                System.out.println("Simple " +simpleCount);



      

    }
}
