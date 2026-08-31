package MultiDemesionArray;

import java.util.Arrays;
import java.util.Scanner;

public class twoDArray
{
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first array Row And Coloum Size: ");
        System.out.println("Enter a number row");
        int row = scan.nextInt();
        System.out.println("Enter a number coloum");
        int Col = scan.nextInt();
        System.out.println("Enter a Element: ");
        int[][] twoDimesionArr =  new int[row][Col];
        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=Col-1;j++){
                twoDimesionArr[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(twoDimesionArr));
    }
}
