package logicalOperators;
import java.util.*;

public class bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Expreience and Salary wheather you eligblf for bounus:");
        System.out.println("First enter Your Experience:");
        int experience = scan.nextInt();
        System.out.println("Enter Your Salary:");
        int salary =  scan.nextInt();

        if(experience>=5 && salary<50000){
            System.out.println("Congratulation Your the eligble for Bonus");
        }else{
            System.out.println("Sorry! Your not Eligble for Bounus");
        }
        scan.close();
        
    }
}
