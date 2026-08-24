package ArrayProblem;

import java.util.Arrays;;

public class mergeTwoArray {
    public static void main(String[] args) {
        int[] arr_1 = {1,2,3};
        int[] arr_2 = {4,5};
        int arr_1Size =arr_1.length;
        int arr_2Size =arr_2.length;
        int finalSize =arr_1Size + arr_2Size;
        int[] newArray = new int[finalSize];

        int k=0;
        for(int i=0;i<=arr_1.length-1;i++){
            newArray[k] = arr_1[i];
            k++;
        }
        int m=0+k;
        for(int j=0;j<=arr_2.length-1;j++){
            newArray[m] = arr_2[j];
            m++;    
        }
        System.out.println(Arrays.toString(newArray));

        
    }
}
