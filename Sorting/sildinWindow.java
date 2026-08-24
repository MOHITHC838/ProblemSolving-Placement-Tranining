package Sorting;

public class sildinWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1,2,1,1,2,2,3,1};
        int n=arr.length;
        int k=3;
        int target = 4;
        int sum =0;
        for(int j=0;j<=(n-k);j++){
            for(int i=j;i<(j+k);i++){
                sum += arr[i];
                            if(sum == target) System.out.println( arr[i]);
                
            }
            System.out.println();
        }
    }
}
