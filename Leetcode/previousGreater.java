package Leetcode;

import java.util.Arrays;

public class previousGreater {
    static void main() {
        String s = "IceCreAm";
        char input[] = s.toCharArray();

        System.out.println(Arrays.toString(input));
        int left =0;
        int right =input.length-1;
        while(left < right){
            if(input[left] !='A'|| input[left] !='E'|| input[left] !='I'||input[left] !='O'||input[left] !='U'||input[left] !='a'||input[left] !='e'||input[left] !='i'||input[left] !='o'||input[left] !='u' ){
                left++;

            }else if( input[right] !='A'||input[right] !='E'||input[right] !='I'||input[right] !='O'||input[right] !='U'||input[right] !='a'||input[right] !='e'||input[right] !='i'||input[right] !='o'||input[right] !='u'){
                right--;

            }else{
                char temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(input));
    }
}
