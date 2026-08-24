package ArrayProblem;

public class secondLargest {
    public static void main(String[] args) {
        int[] array = {12,45,78,34,90,56};
        int max_1 = array[0];
        int max_2 = 0;
        for(int i=1;i<=array.length-1;i++){
            if(array[i]>max_1){
                max_2 = max_1;
                max_1 = array[i];
            }    
        }
            System.out.println("The Second Laregest Element is:" +max_2);
        
        }       
    }

