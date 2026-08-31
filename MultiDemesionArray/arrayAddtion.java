package MultiDemesionArray;

import java.util.Scanner;

public class arrayAddtion {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a row Size: ");
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr1[i][j] + " ");
            }
        }
    }
}
