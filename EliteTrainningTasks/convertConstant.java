package EliteTrainningTasks;

public class convertConstant {
    static void main() {
        String input = "aebss";
        String  output = "";
        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
                output +=  ch;
            }else{
                output +=  '#';
            }
        }
        System.out.println(output);
    }
}
