package ArrayProblem;

public class checkTwoArrayEqual {
    public static void main(String[] args) {
        int[] array_1 = {1,2,3,4};
        int[] array_2 = {1,2,3,4};

        // if (array_1.length == array_2.length) {
        //     System.out.println("equal");     
        // }else{
        //     System.out.println("Not equal");
        // }
        
        boolean op = true;
        for(int i=0;i<=array_1.length-1;i++){
            if (array_1[i] != array_2 [i]) {
             op = false;
            }
    }
    if(op){
        System.out.println("Equal");
    }  
    else{
        System.out.println("not equal");
    }  

    }
}
