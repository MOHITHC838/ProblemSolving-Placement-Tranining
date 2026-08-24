package Looping;

public class sumFactorial {
    public static void main(String[] args) {
        int total =0;
        int[] arr = {2,3,4};
        for(int i=0;i<=arr.length-1;i++){
            int fact=1;
            for(int j=1;j<=arr[i];j++){
                fact = fact *j;
            }
            total += fact;

        }
        System.out.println(total);
        
    }
    
}
