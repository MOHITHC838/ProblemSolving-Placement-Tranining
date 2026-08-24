package ArrayProblem;

public class countConsecutiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,8};

        int n = arr.length;
        int count  =0;
        for(int i=0;i<n;i++){
            if (arr[i+1] == arr[i] +1) {
                
            }
            System.out.println(count);
        }
    }
}
