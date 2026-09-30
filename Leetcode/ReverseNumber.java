package Leetcode;

public class ReverseNumber {
    static void main() {
        int num = -123;
        int rev =0;
        int output =0;
        while (num > 0 || num <0){
            rev = num % 10 + rev * 10;
            output = rev;
            num = num / 10;

        }
        System.out.println(output);
    }
}
