package ArrayProblem;

import java.util.Arrays;;

public class sortedAnArray {
    public static void main(String[] args) {
        int arr[] = {45,12,89, 3, 56};
         System.out.println(Arrays.toString(arr));
        int j=0;
        for(int i=1;i<=arr.length-1;i++){
            if (arr[j] >arr[i]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;   
            }
        }
        System.out.println( );
        System.out.println(Arrays.toString(arr));


    }
}
