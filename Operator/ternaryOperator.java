 package Operator;

public class ternaryOperator {
    public static void main(String[] args) {
        int a=5;
        int b=8;
        int c=3;
        int d=10;

        int max_1 = a>b ? a:b ;
        int max_2 = c>d ? c:d;
        int max_3 =  max_1>max_2 ? max_1 : max_2;

        System.out.println(max_3);
     }

    
}