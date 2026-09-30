package Hashmap;

import java.util.HashMap;

public class hashmapInsertion {
    public static void main(String[] args){
        HashMap<String,Integer> map_1 = new HashMap<>();
        map_1.put("Mohith",2007);
        System.out.println(map_1);

        HashMap<Character,Integer> map_2 = new HashMap<>();
        map_2.put('M',10);
        System.out.println(map_2);

        HashMap<Float,Integer> map_3 = new HashMap<>();
        map_3.put(12.2f,120);
        System.out.println(map_3);
    }
}
