package ArrayProblem;
public class secondSmallest {
    public static void main(String[] args) {
        int[] array = { 12, 45 ,78 ,34 ,90 ,8};

        int min_1 = array[0];
        int min_2 = 0;

        for(int i=1;i<=array.length-1;i++){
            if(min_1 > array[i]){
                min_2 = min_1;
                min_1 = array[i];

            }
        }
        System.out.println("The second min is :" +min_2);

    }
    
}
