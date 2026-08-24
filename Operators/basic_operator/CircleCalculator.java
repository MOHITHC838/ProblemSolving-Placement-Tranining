import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("enter a circle radius:");
        int radius = scan.nextInt();
        double area = 3.14*radius*radius;
        double Circumference = 2 *3.14 *radius;

        System.out.println("The circular area is:" +area);
        System.out.println("The circular Circumference is:"  +Circumference);
        scan.close();
    }
}
