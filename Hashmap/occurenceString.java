package Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class occurenceString {
    public static void main(String[] args){
        String input = "hellooo";

        HashMap<Character,Integer> map_1 = new HashMap<>();
        int count=0;
         for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (map_1.containsKey(ch)){
                int val = map_1.get(ch) +1;
                map_1.put(ch,val);

            }else {
                map_1.put(ch,1);
            }
        }
        System.out.println(map_1);


    }
}

