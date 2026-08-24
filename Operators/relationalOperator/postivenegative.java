package relationalOperator;

import java.util.Scanner;

public class postivenegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number Check Wheather Postive or Negative or Zero:");
        int number = scan.nextInt();

        if(number<0){
            System.out.println("The number is Negative");
        }else if (number>0) {
            System.out.println("The number is postive");  
        }else{
            System.out.println("The number is Zero");
        }
        scan.close();
    }

    
}
