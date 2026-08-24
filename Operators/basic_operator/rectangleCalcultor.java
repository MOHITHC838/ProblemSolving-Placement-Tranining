import java.util.Scanner;

public class rectangleCalcultor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter breath and length:");
        int breath = scan.nextInt();
        int length = scan.nextInt();

        int area = breath*length;
        int perimeter = 2 *(breath+length);

        System.out.println("The area is:" +area);
        System.out.println("The area is:" +perimeter);
                scan.close();

    }
}
