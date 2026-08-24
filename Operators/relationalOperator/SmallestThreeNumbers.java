package relationalOperator;

import java.util.*;
public class SmallestThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int smallest;

        if (a < b) {
            smallest = a;
        } else {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        System.out.println("Smallest Number = " + smallest);

        sc.close();
    }
}