package AssignmentOperator;
import java.util.*;

public class bankBalance {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int bankBalance = 5000;
        System.out.println("This is Your Bank Balance:" +bankBalance);
        System.out.println();
        System.out.println("Enter a amout for deposite:");
        int deposite = scan.nextInt();
        bankBalance +=deposite;
        System.out.println("After deposite The balnace is:" +bankBalance);
        System.out.println();
        System.out.println("Enter a amout withdraw:");
        int withdraw = scan.nextInt();
        bankBalance -=withdraw;
        System.out.println();
        System.out.println("After a withdraw the balnce is:" +bankBalance);


        scan.close();
    }
    
}
