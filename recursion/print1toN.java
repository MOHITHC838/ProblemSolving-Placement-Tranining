package recursion;

public class print1toN {

    public static void main() {
        int n=5;
        printNtime(n);
    }
    public  static void printNtime(int n){

        while (n>0){
            System.out.print(n);
            printNtime(n-1);

        }

    }
}
