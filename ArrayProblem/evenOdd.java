package ArrayProblem;

public class evenOdd {
    public static void main(String[] args) {
        int[] array  = {1,2,3,4,5,6,7};
        int Evencount =0;
        int oddcount =0;
        for(int i=0;i<=array.length-1;i++){
            if (array[i] % 2 ==0) {
                Evencount++;    
            }
            else{
                oddcount++;
            }
        }
        System.out.println("The even Count is:" +Evencount);
        System.out.println("The odd Count is:"  +oddcount);


    }
    
}
