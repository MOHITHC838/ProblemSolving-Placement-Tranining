package EliteTrainningTasks;

import java.util.Scanner;

public class countCharcter {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scan.nextLine();

        int count =0 ;
        for (int i=0;i<input.length();i++){
            count++;
        }
        System.out.print("The count Charcter count is: " +count);
    }
}
