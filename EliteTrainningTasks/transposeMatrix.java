package EliteTrainningTasks;

import java.util.Arrays;
import java.util.Scanner;

public class transposeMatrix {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Transpose Matrix: ");
        System.out.println("enter a number of Row: ");
        int row = scan.nextInt();
        System.out.println("enter a number of Row: ");
        int col = scan.nextInt();
        System.out.println("Enter a array elements: ");

        int[][] arr = new int[row][col];

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]  = scan.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(arr));

        int[][] opArray = new int[col][row];

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                opArray[j][i]  = arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(opArray));

    }
}
