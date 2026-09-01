package EliteTrainningTasks;

import java.util.Scanner;

public class reverseString {

    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scan.nextLine();
        for (int i = input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }



    }
}
