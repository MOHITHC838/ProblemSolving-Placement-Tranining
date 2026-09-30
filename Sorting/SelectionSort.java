package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] SelectSort(int[] arr){
        int n=arr.length;

        for(int i=0;i<=n-2;i++){
            int mini =i;
            for (int j=i;j<=n-1;j++){
                if (arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        return arr;


    }



    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        System.out.println(Arrays.toString(arr));
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
