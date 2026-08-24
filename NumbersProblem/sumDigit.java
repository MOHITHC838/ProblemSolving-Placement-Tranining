
public class sumDigit {
    public static void main(String[] args) {
        int input =12345;
        int rev=0;
        int sum=0;
        while (input>0) {
            rev = input%10;
            sum += rev;
            input=input/10;
            
        }
        System.out.print(" the value is :" +sum);
    }
    
}
