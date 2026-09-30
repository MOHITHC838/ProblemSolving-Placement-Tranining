package EliteTrainningTasks;

public class convertVowel {
    static void main(String[] args) {
        String input = "Education ";
        String  output = "";
        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
                output += '$';
            }else{
                output += ch;
            }
        }
        System.out.println(output);
    }
}
