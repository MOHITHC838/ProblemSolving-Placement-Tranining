public class decimalToBinary {
    public static void main(String[] args) {
        int input  =    12;
        int remainder = 0;
        String output ="";
        int quotient =0;

         while (input>0) {
            remainder = input %2;  
            quotient = input/2;  
            input = quotient;
            output =  remainder + output;
            
         }
        System.out.println(output);
    }
}
