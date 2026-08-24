package ArrayProblem;


public class orderDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,3,1};

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if (arr[i] == arr[j]) {
                    int temp = arr[i+1];
                    arr[i+1] =  arr[j];
                    arr[j] =temp; 
                    
                }
            }
        }
        
        }
    }
    

