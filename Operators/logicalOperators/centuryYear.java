package logicalOperators;
import java.util.Scanner;;
public class centuryYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year wheather Check It Is Leap Year Or Not LeapYear");
        int year =  scan.nextInt();

        if(year%400 ==0 || (year%4==0  &&year%100 !=0)){
            System.err.println("This Year LeapYear");
        }else{
            System.out.println("This is not a Leap Year");
        }
    scan.close();
    }
}
