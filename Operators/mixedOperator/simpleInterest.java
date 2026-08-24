package mixedOperator;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Profit amount:");
        int profit = scan.nextInt();
        System.out.println("Enter the Rate of interest:");
        int rateInterest = scan.nextInt();
        System.out.println("Enter the No of Years(Time):");
        int time = scan.nextInt();

         long simple_Interest = (profit * rateInterest * time)/100;
         System.out.println("Te Simple interest value For :" +simple_Interest);

         scan.close();
    }
    
}
