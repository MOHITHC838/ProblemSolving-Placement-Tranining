package ArrayProblem;

public class countConsective {
    public static void main(String[] args) {
        int[] arr =  {1,2,4,5,6,8};
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+1 == arr[j]) {
                    count++;
                    System.out.println(arr[i]  + ":" +arr[j]);
                    
                }
            }
        }
        System.out.println(count);
        
    }
}
