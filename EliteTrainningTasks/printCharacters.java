package EliteTrainningTasks;

import java.util.Scanner;

public class printCharacters {

    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scan.nextLine();

        for (int i=0;i<input.length();i++){
            System.out.print(input.charAt(i) + " ");
        }

        }




}
