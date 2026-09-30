package BankApplication;

import java.util.Scanner;

public class bankApplication {
    static Scanner scan = new Scanner(System.in);
    static double balance =0;

    public  static void main(String[] args){

        System.out.println("---------------------------------------------");
        System.out.println("WelCome To Bank Application");
        Boolean isRun = true;
        int choice =0;

        while (isRun){
            System.out.println("---------------------------------------------");
            System.out.println("1.Deposit");
            System.out.println("2.WithDraw");
            System.out.println("3.Balance");
            System.out.println("4.Exit");
            System.out.println("---------------------------------------------");
            System.out.println("Enter Your Choice: ");
            choice = scan.nextInt();
            System.out.println("---------------------------------------------");

            System.out.println(choice);
            switch (choice){
                case 1:
                    balance = balance + deposit();
                    break;
                case 2:
                    balance = balance - withDraw();
                    break;
                case 3:
                    balance();
                    break;
                case 4:
                    isRun = false;
                    System.out.println("Thank You!! Come Again");
                    break;
                default:
                    System.out.println("Plese Enter Correct Choice");
            }
        }
    }

    //        Methods
    public static double deposit(){
        System.out.println("Enter A Deposit Amount: ");
        double depAmount = scan.nextDouble();
        if(depAmount<0){
            System.out.println("Enter Valid Amount(Amount Should Not Be Nagetive)");
        }else{
            System.out.println("SucessFully Deposited Amount");
            return depAmount;
        }
        return 0;


    }

    public static double withDraw(){
        System.out.println("Enter a  withDraw Amount.");
        double withdrawAmount = scan.nextDouble();
        if (withdrawAmount<0){
            System.out.println("Entere a Valid Amount");
        }else if (withdrawAmount>balance){
            System.out.println("Insufficent Bank Balance");
            System.out.println("This is Your Balance Amount:");
            System.out.println(balance);
        }else{
            System.out.println("SuccessFully WithDraw. Collect Your cash");
            System.out.println("This is Your Current Balance  Amount:");
            System.out.println(balance);
            return withdrawAmount;
        }
        return 0;



    }

    public static void balance(){
        System.out.println("This is Your Balance Amount:");
        System.out.println(balance);

    }
}
