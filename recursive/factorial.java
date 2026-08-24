package recursive;

public class factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int a){

        if (a < 1) {
            return 1;    
        }
        return fact(a-1) * a;

    }
}
