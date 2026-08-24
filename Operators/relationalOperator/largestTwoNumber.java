package relationalOperator;

import java.util.Scanner;

public class largestTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Two Number Which One is largest:");
        int number_1 = scan.nextInt();
        int number_2 = scan.nextInt();

        if (number_1<number_2) {
            System.out.println("The Second Number is Large");   
        }else{
            System.out.println("The First Number is Large");
        }
        scan.close();
       
    }
}
