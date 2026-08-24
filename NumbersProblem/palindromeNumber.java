
public class palindromeNumber {
    public static void main(String []args){
        int rev =0;
        int input = 121;
        int op = input;
        System.out.println("input:" +input);
        while (input>0) {
            rev = (rev*10) + input%10;
            input = input/10;
        }
        System.out.print(input);
         if(op == rev){
            System.out.println(" this paliondrome no"+ input);
        }
        else{
            System.out.println(" this is not a palindrome "+input);
        }

       
    }
}
