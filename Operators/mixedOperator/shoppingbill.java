package mixedOperator;

import java.util.Scanner;

public class shoppingbill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
               
        System.out.println("Product_1.Mouse Rs:1700");        
        System.out.println("Product_2.KeyBoard Rs:1800");
        System.out.println("Product_3.BlueTooth Speaker RS:1500");
        int product_1 = 1700;
        int product_2 = 1800;
        int product_3 = 1500;

        System.out.println("Enter the No of Quntity For Product_1");
        int quntity_1 =scan.nextInt();
        int finalAmout_1 = product_1*quntity_1;

        System.out.println("Enter the No of Quntity For Product_2");
        int quntity_2 =scan.nextInt();
        int finalAmout_2 = product_2*quntity_2;

       System.out.println("Enter the No of Quntity For Product_3");
        int quntity_3 =scan.nextInt();
        int finalAmout_3 = product_3*quntity_3;

        int total_Bill = finalAmout_1 + finalAmout_2 + finalAmout_3;
        System.out.println("The total amout is:" +total_Bill);
        if(total_Bill>5000){
            System.out.println(" congrat you got 10% discount");
        }else{
            System.out.println("thank You! come Again");
        }
      scan.close();  
      
    }
}
