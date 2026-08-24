package ArrayProblem;

import java.util.Scanner;

public class sumArray {
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
        System.out.print( "The sum is :" +sum);
        scan.close();
        
    }

    
}