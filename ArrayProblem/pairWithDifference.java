package ArrayProblem;

public class pairWithDifference {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] - arr[j] == 2 || arr[j] - arr[i] == 2) {
                    System.out.println("PAIR FOUNDED-> "+arr[i] + ":" +arr[j]);    
                }
            }
            break;
        }
    }
}
