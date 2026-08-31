package EliteTrainningTasks;

import java.util.Scanner;

public class printNextCharacterupperCase {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a input String: ");
        String input = scan.nextLine();
        String op ="";
        int val;

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);

            if (ch  != 'z'){
                if (Character.isUpperCase(ch)){
                    val = ((int)ch)+1;
                    op += Character.toLowerCase((char)val);

                }
                else{
                    val = ((int)ch)+1;
                    op += Character.toUpperCase((char)val);

                }
            }else{
                char temp ='a';
                if (Character.isUpperCase(ch)){
                     op += Character.toLowerCase('a');
                 }else {
                     op += Character.toUpperCase(temp);
                 }
            }
        }
        System.out.println("The next Character: ");
        System.out.println(op);
    }
}
