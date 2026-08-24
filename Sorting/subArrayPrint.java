package Sorting;

public class subArrayPrint {
    public static void main(String[] args) {
        int[] arr = {5,-1,1,2,1,-1,5,2,-3};
        int target = 4;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j+1;k++){
                    sum +=arr[j];                    
                }
                if(sum == target){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }   
    }
    
}
