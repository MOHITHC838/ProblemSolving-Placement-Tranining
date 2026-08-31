package StringEasy;

public class characterFrequency {
    static void main() {
        int count_A=0;
        int count_B=0;
        int count_c=0;
        String input = "aabcc";
        for (int i=0;i<=input.length()-1;i++){
            if (input.charAt(i) == 'a'){
                count_A++;
            } else if (input.charAt(i) == 'b') {
                count_B++;
            } else if (input.charAt(i) == 'c') {
                count_c++;

            }
        }
        System.out.println("a: " +count_A);
        System.out.println("b: " +count_B);
        System.out.println("c: " +count_c);
    }
}
