package ArrayProblem;


public class movePostiveNumber {
    public static void main(String[] args) {
        int[] arr = {-2,5,-1,-5,-4};
        int  n=arr.length;

        int left = 0;
        int right = left + 1;
        while (right<n) {
            if (arr[left]<0 && arr[right]>0) {
                int temp = arr[right];
                arr[right]= arr[left];
                arr[left] = temp;
                left++;
                right++;                
            }
            right++;           
        }
        // System.out.println(Arrays.toString(arr));
        for(int op:arr){
            System.out.print( " "+op);
        }

    } 
}
