import java.util.Scanner;

public class celsiusFahrenhit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a celsius value:");
        int celsius = scan.nextInt();

        double fahrenheit =(celsius*9/5)+32;
        System.out.println(" The fahrenheit value is" +fahrenheit);

        scan.close();
    }
}
