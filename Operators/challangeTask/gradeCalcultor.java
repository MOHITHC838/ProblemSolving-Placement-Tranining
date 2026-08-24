package challangeTask;

import java.util.Scanner;

public class gradeCalcultor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Percentage:");

        float percent = scan.nextFloat();

        if(percent>90){
            System.out.println("Grade A");
        }
        else if (percent>80 &&percent<90) {
            System.out.println("Grade B"); 
        }
        else if(percent>70 &&percent<80){
            System.out.println("Grade C");
        }
        else if(percent>60 && percent<70){
            System.out.println("Grade D");
        }
        else if(percent>40 && percent>50){
            System.out.print("Grade E");
        }
        else{
            System.out.println("Fail");
        }
        scan.close();
    }
}
