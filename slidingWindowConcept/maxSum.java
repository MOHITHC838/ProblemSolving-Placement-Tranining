package slidingWindowConcept;

public class maxSum {

    public static void maxSum(int[] array,int k){
        int n= array.length;
        int max=0;

        for (int i=0;i<=n-k;i++){
            int sum=0;
            for (int j=i;j<i+k;j++){
                sum +=array[j];
            }
            if (sum > max){
                max =  sum;
            }
        }
        System.out.println("The maximum sum is:"+ max);

    }


    public  static void main(String[] args){
        int[] arr =  {2,1,5,1,3,2};
        maxSum(arr,3);

    }

}
