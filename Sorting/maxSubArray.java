package Sorting;

public class maxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int  n=arr.length;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                }
                if(max<sum){
                    max = sum;
                }
                sum =0;
            }
        }
        System.out.println(max);

    }
    
}
