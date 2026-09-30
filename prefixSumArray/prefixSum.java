package prefixSumArray;

import java.util.Arrays;

public class prefixSum {
    public static void main(String[] args){
        int[] arr = {2,4,1,3,5};
        int n = arr.length;
        int[] prefixArr  = new int[n];
        prefixArr[0] = arr[0];

        for (int i=1;i<prefixArr.length;i++){
            prefixArr[i]  = prefixArr[i-1] +  arr[i];


        }
        System.out.println(Arrays.toString(prefixArr));
    }
}
