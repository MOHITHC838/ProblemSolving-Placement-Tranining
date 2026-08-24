package ArrayProblem;

public class smallest {
    public static void main(String[] args) {
        int[] array = {12,45,8,99,21};
        int min = array[0];
        for(int i=1;i<=array.length-1;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("this is a Smallest elment" +min);
        
    }
    
}
