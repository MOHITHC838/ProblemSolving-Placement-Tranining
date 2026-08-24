package ArrayProblem;

public class linerSerch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 30;
        for(int i=0;i<=arr.length-1;i++){
            if (arr[i] == target) {
                System.out.println(i);
            }

        }

    }
    
}
