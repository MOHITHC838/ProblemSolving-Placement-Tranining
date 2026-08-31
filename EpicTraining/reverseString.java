package EpicTraining;

public class reverseString {
    static void main() {
        String input = "hello";
        System.out.println(reverseStr(input));

    }
    static String reverseStr(String inp){
        String output = "";
        for(int i=inp.length()-1; i>=0;i--){
            output += inp.charAt(i);

        }
        return  output;

    }
}
