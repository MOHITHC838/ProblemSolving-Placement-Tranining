package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void InsertionSort(int[] array){
        int n=array.length;

        for (int i=1;i<array.length;i++){
            int temp = array[i];
            int j=i-1;
            while (j >=0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

    }

    public static void main(String[] args){
        int[] arr = {5,7,1,2,0};
        System.out.println(Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
