package EpicTraining;

public class withoutIfElseCharacter {
    static void main() {
        String input = "zzz ";
        String op = "";
        for(int i=0; i<=input.length()-1;i++){
            char ch =  input.charAt(i);
            int val = (int)ch -25;
            op += (char)val;

        }
        System.out.println(op);

    }

}
