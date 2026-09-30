package StringEasy;

public class operationOperands {
    static void main() {

        String input  = "12345-+*/";
        int len = input.length();
        int temp = input.charAt(0) - '0';
        int val;
        for(int i=(len/2)+1;i<len;i++){
            switch (input.charAt(i)){
                case '-':
                    val= input.charAt(i - len/2);
                    temp -= val;
                    break;
                case '+':
                     val = input.charAt(i - len/2);
                    temp +=val;
                    break;
                case '*':
                     val = input.charAt(i - len/2);
                    temp *=val;
                    break;
                case '/':
                     val = input.charAt( i-len/2);
                    temp /=val;
                    break;
                case '%':
                     val= input.charAt(i - len/2);
                    temp %=val;
                    break;
            }
        }
        System.out.print(temp);


    }
}
