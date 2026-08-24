package ArrayProblem;

import java.util.Arrays;

public class rotateArrayleftByOne {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int last =arr.length-1;
        
        int temp = arr[0];
        for(int i=1;i<=arr.length-1;i++){
            arr[i-1] = arr[i];
        }
        arr[last] = temp;
        System.out.println(Arrays.toString(arr));

    }
    
}
