package slidingWindowConcept;

public class countWindow {


    public static void countWindow(int[] array, int k,int x){
        int n= array.length;
        int cout =0;
        for (int i=0;i<=n-k;i++){
            int sum = 0;
            for (int j=i;j<i+k;j++){
                sum += array[j];

            }
            if (sum > x){
                cout++;
            }
        }
        System.out.println("The maximum count is :" +cout);
    }

    public static void main(String[] args){
        int[] arr= { 2,1,5,1,3,2};
        countWindow(arr,3,7);

    }
}
