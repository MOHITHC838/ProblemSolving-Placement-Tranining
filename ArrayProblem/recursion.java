package ArrayProblem;


public class  recursion {
    public static void mohith(int arr[],int index){
        if(index == arr.length){
            return;
        }
        System.out.print(arr[index]);
        mohith(arr,index+1); 
        System.out.print(" ");
        System.out.print(arr[index]);
       

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        mohith(arr,0);
    }
    
      
}

    


    

