 package Conditional;
public class switchCalculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println("1.addition");
        int input =1;

        switch (input) {
            case 1:
                int c = a+b;
                System.out.println(c);                
                break;
        
            default:
                break;
        }
    }

    
}