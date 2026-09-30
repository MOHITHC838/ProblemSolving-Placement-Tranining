package EpicTraining;

import java.lang.reflect.Array;
import java.util.Arrays;

public class duplicatePrint {
    static void main(String[] args) {
        int[] arr= new int[26];

        String inp = "abbccdee";

        for(int i=0;i<inp.length();i++){
            char ch = inp.charAt(i);
            int val = (int)ch -'a';
            arr[val]++;
        }
//
        for(int i=0;i<inp.length();i++){
            int temp = inp.charAt(i) - 'a';
//                System.out.println((char)(temp+97) + ":" +arr[temp]);

                if (arr[temp] >1){
                    System.out.println((char)(temp+97) + ":" +arr[temp]);

                }
                if (arr[temp] > 1){
                    arr[temp] = 0;
                }
        }



    }
}
