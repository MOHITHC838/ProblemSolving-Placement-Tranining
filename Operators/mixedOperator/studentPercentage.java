package mixedOperator;
import java.util.*;

public class studentPercentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Five Subject Mark:");
        int tamil = scan.nextInt();
        int english = scan.nextInt();
        int maths = scan.nextInt();
        int science = scan.nextInt();
        int socialScience = scan.nextInt();

        int total = tamil + english+  maths+ science+ socialScience;
        double avg = total/5;
        System.out.println("your avrage" +avg);

        int percenatge = total/5;
        System.out.println("thus is you percentage" +percenatge);

        if (tamil>=35 && english>=35 && maths>=35 && science>=35 && socialScience>=35) {
            System.out.println("Your pass");   
        }else{
            System.out.println("your fail ");
        }
        scan.close();


        
    }
}
