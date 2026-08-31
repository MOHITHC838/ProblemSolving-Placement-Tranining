package StringEasy;

import java.util.Arrays;

public class reverseWord_order {
    static void main() {
        String input = "i love java";

        String charArray[] = input.split(" ");
        int left = 0;
        int right = charArray.length-1;
        while (left <= right){
            String temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(charArray));



    }
}
