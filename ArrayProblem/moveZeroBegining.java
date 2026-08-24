package ArrayProblem;

import java.util.Arrays;

public class moveZeroBegining {
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5,0,7};

        int left = 0;
        int right = left+1;

        while ( right < arr.length-1) {
            if (arr[right] == 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left]= temp;
                left++;
                right++;    
            }else{
                right++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
