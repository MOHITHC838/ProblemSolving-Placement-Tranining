public class NeonNumber {
    public static void main(String[] args) {
        int input =10;
        int rev=0;
        int sum=0;
        int squre = input*input;

        while (squre>0) {
            rev = squre%10;
            sum += rev;  
            squre= squre/10;

        }
        System.out.println(sum);
        if(input == sum){
            System.out.println("neon number");
        }
        else{
            System.out.println(" not a neon number");
        }
    }
    
}
