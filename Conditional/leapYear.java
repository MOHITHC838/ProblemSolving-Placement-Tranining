package Conditional;
public class leapYear {
    public static void main(String[] args) {
        int input = 2026;

        if (input % 4 ==0 || input %400 ==0 && input %100 !=0) {
            System.out.println("Leap year"); 
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
