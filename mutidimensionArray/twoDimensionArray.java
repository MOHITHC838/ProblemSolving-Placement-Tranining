package mutidimensionArray;
import java.util.*;

public class twoDimensionArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of row");
        int row = scan.nextInt();
        System.out.println("Enter a  number of colums");
        int colum = scan.nextInt();

        int[][] arr =  new int[row][colum];

        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.print(arr[0][1]);
        // System.out.println(Arrays.deepToString(arr));
        for (int[] k : arr) {
            System.out.println(k);
  
        }

    }
}
    

