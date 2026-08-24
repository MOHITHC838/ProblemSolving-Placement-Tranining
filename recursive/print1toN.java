package recursive;

public class print1toN {
    public static void main(String[] args) {
        printN(10);
        
    }
    public static void printN(int n){
        if (n < 1) {
            return;
        }
        printN(n-1); 
        System.out.println(n);       

    }

    
}