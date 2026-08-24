package ArrayProblem;

public class pairWithMaxSum {
    public static void main(String[] args) {
        int[] arr = {10,5,20,8,15};
        int max1=arr[0];
        int max2=0;
        for(int i=1;i<arr.length;i++){
            if (max1 > arr[i] && max2<arr[i]) {
                max2 = max1;
                max1 = arr[i];

             System.out.println(max1);
             System.out.println(max2);
                
            }
        }
       
    }
}
