package Sorting;

public class sumOfSubArray {
    
    public static void main(String[] args) {
        int[] arr = {2,1,3};
        int n= arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                System.out.print("sum: " +sum);
                System.out.println();
                sum  =0;
            }
            System.out.println();
        }
    }
}
