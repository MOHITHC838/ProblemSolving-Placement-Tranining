package slidingWindowConcept;

public class sumConscutiveElement {

    public static void window(int[] arr,int k){
        for (int i=0;i<=arr.length-k;i++){
            int sum =0;
            for (int j=i;j<i+k;j++){
                sum += arr[j];
            }
            System.out.print(sum);
            System.out.println();
        }


    }

    public  static void main(String[] args){
        int arr[] = {2,1,5,1,3,2};
        int k=3;
        window(arr,k);

    }
}
