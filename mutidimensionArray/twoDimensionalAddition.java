package mutidimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class twoDimensionalAddition {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println(" ENTER A NUMNER OF ROWS AND COLUMS FOR ARRAY_1");
        System.out.println("Enter a number of row");
        int row_1 = scan.nextInt();
        System.out.println("Enter a  number of colums");
        int colum_1 = scan.nextInt();


        System.out.println("ENTER NUMBER OF ROW AND COLUMS FOR ARRAY_2");
         System.out.println("Enter a number of row");
        int row_2 = scan.nextInt();
        System.out.println("Enter a  number of colums");
        int colum_2 = scan.nextInt();

        int[][] arr_1=  new int[row_1][colum_1];
        int[][] arr_2=  new int[row_2][colum_2];
        int[][] sum = new int[row_1][colum_1];

        System.out.println();
        System.out.println("NOW YOU ENTER ARRAY_1");

        for(int i=0;i<row_1;i++){
            for(int j=0;j<colum_1;j++){
                arr_1[i][j]=scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("NOW YOU ENTER ARRAY_2");

         for(int i=0;i<row_2;i++){
            for(int j=0;j<colum_2;j++){
                arr_2[i][j]=scan.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<row_1;i++){
            for(int j=0;j<colum_1;j++){
                sum[i][j] = arr_1[i][j] + arr_2[i][j];
            }
        }
        System.out.println("THE SUM TWO D MATRIX");
        System.err.println(Arrays.deepToString(sum));
        
    }
    
}
