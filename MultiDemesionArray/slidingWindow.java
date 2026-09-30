package MultiDemesionArray;

public class slidingWindow {

    static void main() {
        int[] arr =  {1,2,3,4,5};
        int k =3;
        int finalSum=0;
        for (int i=0;i<arr.length-k;i++){
            int sum =0;
            for(int j=i;j<k;j++){
                sum += arr[j];
            }
            if (finalSum < sum){
                finalSum = sum;
            }

        }
        System.out.println(finalSum);

    }
}
