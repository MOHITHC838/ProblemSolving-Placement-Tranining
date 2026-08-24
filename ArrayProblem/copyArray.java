package ArrayProblem;
import java.util.Arrays;;
public class copyArray {
    public static void main(String[] args) {
    int[] oldArray = {5, 10, 15 ,20, 25};
    int oldLength = oldArray.length;
    int[] newArray = new int[oldLength];
    int k=0;
    for(int i=0;i<=oldArray.length-1;i++){
        newArray[k] = oldArray[i];
        k++;
    }
    System.out.println(" this is from old array:");
    System.out.println(Arrays.toString(oldArray));
    System.out.println(" this is from new array");
    System.out.println(Arrays.toString(newArray));    
    }
}
