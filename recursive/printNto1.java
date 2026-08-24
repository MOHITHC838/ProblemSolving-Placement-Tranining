package recursive;

public class printNto1 {
    public static void main(String[] args) {
        printN(10);
        
    }
    public static void printN(int a){

        if (a<1) {
            return;    
        }
        System.out.println(a);
        printN(a-1);


    }
}
