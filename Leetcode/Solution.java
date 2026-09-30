package Leetcode;

import java.util.HashMap;

public class Solution {

    static void main() {
        HashMap<Integer,Integer> map  =  new HashMap<>();
        int[] nums = {3,2,3};


        for(int i=0;i<nums.length;i++){
            int ele = nums[i];
            if (map.containsKey(ele)){
                int val = map.get(ele) +1;
                map.put(ele,val);
            }else{
                map.put(ele,1);
            }

        }






    }

}
