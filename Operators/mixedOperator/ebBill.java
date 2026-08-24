package mixedOperator;

import java.util.*;

public class ebBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("One Unit Amout: 50");
        System.out.println();
        System.out.println("enter how many unit did you use:");
        int unit = scan.nextInt();
        int unitPrice = unit * 50;
        System.out.println("Your unit price amount is:" +unitPrice);
        System.out.println(" If The unit Price more than 900 .The surchange amount is(200)");
        if(unitPrice >900){
            System.out.println(unitPrice +=200);
            System.out.println("the 200 surchange added your amount");
        }
        else{
            System.out.println("no add surchange amout");
        }
        scan.close();
    }
    
}
