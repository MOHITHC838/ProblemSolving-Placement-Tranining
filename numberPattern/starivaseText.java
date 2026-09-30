package NumberPattern;

import java.util.Arrays;

public class starivaseText {

    static void starivaseText(String inp){
        String[] StrArr =  inp.split( " ");
        int n= inp.length();
        for (int i=0;i<StrArr.length;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(StrArr[i]);

        }



        }




    static void main() {
        String input = "design pattern in java";
        starivaseText(input);
    }
}
