package StringEasy;

import java.util.Arrays;

public class CountLetter {
    static void main(String[] args) {
        int[] arr = new int[26];
        String input = "Bbcaaa";

        char ch =0;
        for(int i=0;i<input.length();i++){
             ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                int val  = (int)ch - 'A';
                arr[val]++;
            }else {
                int val = (int) ch - 'a';
                arr[val]++;

            }
        }


        for (int i=0;i<arr.length;i++){
            if (arr[i] > 0){
                System.out.println((char)(i +97) + ":" + arr[i]);
            }
        }

//        for (int i=0;i<input.length();i++){
//            int temp  = input.charAt(i) - 97;
//            if (arr[temp] > 0){
//                System.out.println(input.charAt(i) +":"+arr[temp]);
//            }
//            if (arr[temp] > 1){
//                arr[temp] = 0;
//
//            }



        }



    }


//using array to print  after arr[val]+++
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] > 0){
//                System.out.println((char)(i +97) + ":" + arr[i]);
//            }
//        }
