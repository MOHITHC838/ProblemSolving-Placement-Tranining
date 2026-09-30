package slidingWindowConcept;

public class maximumElementWindow {
    public  static void maximumElementWindow(int[] array,int k){
        int n= array.length;
        for (int i=0;i<=n-k;i++){
            int maxElement =0;
            for (int j=i;j<i+k;j++){
                if (maxElement < array[j]){
                    maxElement = array[j];
                }

            }
            System.out.println(maxElement);
        }


    }



    public static void main(String[] args){
        int[] arr = {1,3,2,5,4,6};
        maximumElementWindow(arr,3);
    }
}
