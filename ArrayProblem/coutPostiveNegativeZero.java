package ArrayProblem;

public class coutPostiveNegativeZero {
    public static void main(String[] args) {
        int arr[] = { 5, -2 ,0, 8 ,-7 ,0 ,3};

        int postiveCount = 0;
        int negativeCount =0;
        int zeroCount =0;
        for(int i=0;i<=arr.length-1;i++){
            if (arr[i] < 0) {
                negativeCount++;  
            }
            else if (arr[i] > 0) {
                postiveCount++;                
            }
            else if (arr[i] == 0) {
                zeroCount++;   
            }
        }
        System.out.println(postiveCount);
        System.out.println(negativeCount);
        System.out.println(zeroCount);
     
    }
    
}
