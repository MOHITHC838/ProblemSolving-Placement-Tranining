package recursive;

public class power {
    public static void main(String[] args) {

        int base = 2;
        int exponent = 5;
        System.out.println(power(base,exponent));
        
    }
    public static int power(int base,int exponent){

        if (exponent < 1) {
            return 1;   
        }
        return base * power(base, exponent-1);



    }
    
}
