package slidingWindowConcept;

public class minimumSum {

    public static void maxSum(int[] array,int k){
        int n=array.length;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<=n-k;i++){
            int sum =0;

            for (int j=i;j<i+k;j++){
                sum += array[j];
            }
//            System.out.println(sum);
            if (min > sum){
                min = sum;
            }
        }
        System.out.println(min);

    }





    public  static void main(String[] args){
        int[] arr = {4,2,9,7,8,1,2};
        maxSum(arr,3);



    }
}
