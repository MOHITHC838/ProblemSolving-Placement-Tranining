package ArrayProblem;

import java.util.Arrays;


public class arrayNtimeRotae {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5};
        int n= arr.length;

        int rot =2;
        int k =0;
        while (k<rot) {
                    int temp = arr[0];

             for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
            }
            arr[n-1] = temp;
            k++;  
        }
        System.out.println(Arrays.toString(arr));

       
        
    }
    
}
