package Hashmap;

import java.util.HashMap;

public class SubString {
    static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('0',0);
        hm.put('1',0);
        String  s1 = "101101000011111";
        String s = s1;
        int max = 0;
        for(int i = 0;i< s.length();i++){
            for(int j = i;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    hm.put('1',hm.get('1')+1);
                }
                else{
                    hm.put('0',hm.get('0')+1);
                }
                if(hm.get('0')==hm.get('1')){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        System.out.println(max);
    }
}
