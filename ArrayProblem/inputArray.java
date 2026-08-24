package ArrayProblem;

import java.util.*;

public class inputArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        int n = arr.length;
        int rot = scan.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[(i+(n-rot)) % n] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    
    
        
    }
}
