package relationalOperator;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("enter a wheather even or  odd:");
        int number = scan.nextInt();

        if(number % 2 ==0){
            System.out.println("the number is even" );
        }else{
            System.out.println("the number is odd");
        }
        scan.close();
    }
}
