package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class expressionArrayList {
    static void main(String[] args) {
        String input = "a@i9$k2j67p";
        System.out.println("The input is: " +input);

        ArrayList<Character> num= new ArrayList<>();
        ArrayList<Character> alp= new ArrayList<>();

        for (int i=0;i<input.length();i++){
            char ch =  input.charAt(i);
            if (Character.isLetter(ch)){
                alp.add(ch);
            }else if (Character.isDigit(ch)){
                num.add(ch);
            }
        }
        num.sort(null);
        Collections.reverse(alp);

        String emp ="";
        int alpInd=0;
        int numInd=0;
        for (int j=0;j<input.length();j++){
            char ch1 =  input.charAt(j);
            if (Character.isAlphabetic(ch1)){
                emp +=alp.get(alpInd);
                alpInd++;

            }else if (Character.isDigit(ch1)){
                emp +=num.get(numInd);
                numInd++;
            }else{
                emp += ch1;
            }

        }
        System.out.println("The output is: "+emp);

    }
}
