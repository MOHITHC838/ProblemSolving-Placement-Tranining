package ArrayProblem;

public class countOccurance {
    public static void main(String[] args) {
        int[] arr = {2,1,2,2,5,4};
        int target = 2;   //check how many time come in the array

        int count =0;
        for(int i=0;i<=arr.length-1;i++){
            if (arr[i] == target) {
                count++;
                
            }

        }
        System.out.println("The Count is:" +count);
    }
    
}
