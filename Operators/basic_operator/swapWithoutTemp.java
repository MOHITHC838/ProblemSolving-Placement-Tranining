import java.util.Scanner;

public class swapWithoutTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a two number for swap operation:");
        int nums_1 = scan.nextInt();
        int nums_2 = scan.nextInt();
    
        System.out.println("The  value of nums_1 before swap:" +nums_1);
        System.out.println("The  value of nums_2 before swap:" +nums_2);

        nums_1 = nums_1+nums_2;
        nums_2 = nums_1 - nums_2;
        nums_1 = nums_1 - nums_2;
        System.out.println();

        System.out.println("The  value of nums_1 after swap:" +nums_1);
        System.out.println("The  value of nums_2 after swap:" +nums_2);
        scan.close();
    }
}
