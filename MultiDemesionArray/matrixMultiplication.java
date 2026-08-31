package MultiDemesionArray;

import java.util.Arrays;
import java.util.Scanner;

public class matrixMultiplication {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Arraya Manipulation: ");

        System.out.println("Enter row1 Size: ");
        int row1 =  scan.nextInt();

        System.out.println("Enter col1 Size: ");
        int col1 =  scan.nextInt();

        int[][] arr1 = new int[row1][col1];

        int[][] arr2 = new int[row1][col1];


        for(int i=0;i<=row1-1;i++){
            for(int j=0;j<=col1-1;j++){
                arr1[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<=row1-1;i++){
            for(int j=0;j<=col1-1;j++){
                arr2[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

    }
}
