package ArrayProblem;

import java.util.Scanner;
public class calculateAverage {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Array Size:");
        int size = scan.nextInt();
        int[] arr =  new int[size];
        for(int i=0;i<=size-1;i++){
            arr[i]= scan.nextInt();           
        }
        // sum
        int sum =0;
        for(int i =0;i<=arr.length-1;i++){
            sum += arr[i];

        }
        int avg = (sum)/size;
        System.out.print( "The average  is :" +avg);
        scan.close();

    }
    
}
