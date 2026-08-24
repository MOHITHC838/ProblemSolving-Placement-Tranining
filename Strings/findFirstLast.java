package Strings;

public class findFirstLast {
    public static void main(String[] args) {
        String input =  "kishore";
        char ch[] = input.toCharArray();
        int last = ch.length-1;
        System.out.println("First Letter: " +ch[0]);
        System.out.println("Last Letter "+ch[last]);
    }
}
