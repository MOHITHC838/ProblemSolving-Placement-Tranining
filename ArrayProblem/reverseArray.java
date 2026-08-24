package ArrayProblem;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int j=array.length-1;
        for(int i=0;i<=array.length-1;i++){
            if (array[i]<array[j]) {
            int temp =array[j];
            array[j] = array[i];
            array[i]= temp;
                
            }

        }
        
        System.out.println(Arrays.toString(array));

    }
    
}
