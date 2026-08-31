package EpicTraining;

import  java.util.Scanner;

public class PrintNextCharacter {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String  input = scan.nextLine();
       System.out.println( nextChar(input));

    }

    static String nextChar(String inp){
        String op = " ";
        for (int i=0;i<=inp.length()-1;i++){
            char ch = inp.charAt(i);
            if (ch != 'z'){
                int val = ((int)ch + 1);
                op +=(char)val;
            }
            op += 'a';


        }
        return  op;

    }

}
