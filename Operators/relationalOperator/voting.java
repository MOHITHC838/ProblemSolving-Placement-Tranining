package relationalOperator;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("enter a  age wheather you eligble for vote: ");
        int age = scan.nextInt();

        if (age>=18) {
            System.out.println("Congradulation your Eligble for vote");  
        }else{
            System.out.println("Sorry You are Not Eligble");
        }
        scan.close();
    }
    
}
