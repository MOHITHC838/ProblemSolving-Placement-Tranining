package EliteTrainningTasks;

import java.util.Scanner;

public class serchCharecter {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scan.nextLine();

        boolean isBool = false;
        char ch = 'e';
        for (int i=0;i<input.length();i++){
            if (input.charAt(i) == 'e'){
                isBool = true;
                break;
            }else{
                isBool = false;
            }
        }
        if (isBool){
            System.out.print("found");
        }else{
            System.out.print("Not Found");
        }

    }
}
