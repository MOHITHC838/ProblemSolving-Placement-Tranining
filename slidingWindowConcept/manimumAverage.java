package slidingWindowConcept;

public class manimumAverage {

    public static void maxAvg(int[] array,int k){
        int n=array.length;
        int maxAvg =0;
        for (int i=0;i<=n-k;i++){
            int sum =0;
            for (int j=i;j<i+k;j++){
                sum +=array[j];

            }
            int avg = sum / k;
            if (maxAvg < avg){
                maxAvg = avg;
            }
        }
        System.out.println("the maximum average is: "+maxAvg);

    }

    public static void main(String[] args){
        int[] arr= {2,4,6,8,10};
        maxAvg(arr,2);
    }
}
