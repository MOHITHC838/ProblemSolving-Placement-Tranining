package ArrayProblem;


public class plusone {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int sum=0;
        int temp =0;

        for(int i=0;i<=digits.length-1;i++){
            sum = sum*10+digits[i];
            temp = sum+1;
        }
        int last=temp;
        int count =0;
        while (temp>0) {
             temp = temp/10;
             count++;    
        }
        
        int k=count-1;
        int[] newArray = new int[count];
        while (last>0) {
            int lastValue = last%10;
            last = last/10;  
            newArray[k] = lastValue;
            k--; 
        }


    }
}
