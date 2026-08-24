package Conditional;

public class maxElement {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 15;
        int num3 = 3;
        int num4 = 9;

        int max=0;

        if (num1<num2) {
            max =num2; 
        }
        else if (max <num3){
            max = num3;    
        }
        else if (max<num4) {
            max = num4;    
        }
        System.out.println(max);
    
    }
}
