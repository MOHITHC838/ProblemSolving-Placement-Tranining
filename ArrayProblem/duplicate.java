package ArrayProblem;



public class duplicate {
    public static void main(String[] args) {
         int[] arr = {1,2,3,2,4,3,1};
         for(int i=0;i<=arr.length-1;i++){
            // int count =1;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i] == arr[j]){
                    // count = +1;
                    System.out.print(arr[i]);
                }
            }
         }
    }
}
