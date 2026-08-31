package EpicTraining;

import java.util.Scanner;

public class StringTraverse {
    static void main() {
        Scanner scan = new  Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = scan.nextLine();
        String opStr = "";
        for(int i=0;i<=input.length()-1;i++){
            opStr += input.charAt(i);
            opStr += " ";

        }
        System.out.print(opStr);
    }
}
