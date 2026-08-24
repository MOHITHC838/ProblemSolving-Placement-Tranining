package ArrayProblem;

import java.util.Arrays;
import java.util.Scanner;

public class ReadPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Array Size:");
        int size = scan.nextInt();
        int[] arr =  new int[size];
        for(int i=0;i<=size-1;i++){
            arr[i]= scan.nextInt();           
        }
        System.out.println("The output is:");
        System.out.println(Arrays.toString(arr));            
        scan.close();
    }
    
}

