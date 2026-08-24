public class binarydecimal {
    public static void main(String[] args) {
        int input = 1101;
        int lastDigit = 0;
        double output =0;
        int i=0;


        while (input>0) {
            lastDigit = input%10;
            output = output  + (lastDigit * Math.pow(2,i));
            input = input/10;
            i++;
        }
        System.out.println(output);
    }
}
