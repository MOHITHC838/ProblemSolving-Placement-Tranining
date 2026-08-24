package logicalOperators;
import java.util.Scanner;
public class passFail {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter Your Five Subject Mark");
        System.out.println("Enter Your tamil Subject Mark:");
        int tamil = scan.nextInt();
        System.out.println("Enter Your english  Subject Mark:");
        int english = scan.nextInt();
        System.out.println("Enter Your maths Subject Mark:");
        int maths = scan.nextInt();
        System.out.println("Enter Your science  Subject Mark:");
        int science = scan.nextInt();
        System.out.println("Enter Your socialScience Subject Mark:");
        int socialScience = scan.nextInt();

        if(tamil>=35 && english>=35 &&maths>=35 &&science>=35 &&socialScience>=35){
            System.out.println("Congrats You Pass All Subject");
            
        }
        else{
            System.out.println("Sorry You Failed");
        }
        scan.close();
        
    }
}
        
