import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a two Number perform opearator(+,-,*,/,%):");
        int nums_1 = scan.nextInt();
        int nums_2 = scan.nextInt();

        int add = nums_1 + nums_2;
        int subract = nums_1 - nums_2;
        int multiple = nums_1 * nums_2;
        int division = nums_1 / nums_2;
        int moduls = nums_1 % nums_2;

        System.out.println(" the addition is:" +add);
        System.out.println(" the subract is:" +subract);
        System.out.println(" the multiple is:" +multiple);
        System.out.println(" the division is:" +division);
        System.out.println(" the moduls is:" +moduls);
                scan.close();


        
    }

    
}