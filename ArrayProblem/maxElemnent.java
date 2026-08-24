package ArrayProblem;


public class maxElemnent {
    public static void main(String[] args) {
        int[] arr = {2,5,3,4,7};
        int max=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(max<arr[i]){
                max = arr[i];
            }
         
        }
        System.out.print(max);
    }
    
}
