package IncrementDecrementOpeartor;

public class counter {
    public static void main(String[] args) {
        int count =0;
        for(int i=1;i<=5;i++){
            count++;
        }
        for(int j=count; j>=3;j--){
            count--;

        }
        System.out.println(count);
        
    }
}
