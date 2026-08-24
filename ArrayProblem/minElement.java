package ArrayProblem;


public class minElement {
    public static void main(String[] args) {
        int[] arr = {2,5,3,4,7};
        int min=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(min>arr[i]){
                min = arr[i];
            }
         
        }
        System.out.print(min);
    }
    
}

