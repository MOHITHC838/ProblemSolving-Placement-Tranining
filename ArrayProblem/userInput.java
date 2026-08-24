package ArrayProblem;

import java.util.*;

public class userInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Size:");
        int arr[]  = new int[size];
      
        System.out.println("Rotate:");
        int rot =scan.nextInt();

        int n= arr.length;
        for(int i=n-rot;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        for(int i=0;i<rot+1;i++){
            arr[i] = scan.nextInt();
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
