package ArrayProblem;

public class largest {
    public static void main(String[] args) {
        int[] array = {12,45,8,99,21};
        int max = array[0];
        for(int i=1;i<=array.length-1;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("this is a largest elment" +max);

    }
    
}
