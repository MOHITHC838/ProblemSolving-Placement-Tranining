package ArrayProblem;

public class duplicateShow {
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,3,2,2};

        int left = 0;
        int right = left+1;

        while (right<arr.length-1) {
            if(arr[left] == arr[right]){
                System.out.println(arr[left]);
                left++;
                right++;
                
            }else{
                right++;
            }
            
        }
    }
    
}
