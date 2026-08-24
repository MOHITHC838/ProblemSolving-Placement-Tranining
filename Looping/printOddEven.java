 package Looping;

public class printOddEven {
    public static void main(String[] args) {
        int n =10;

        for(int i=1;i<=n;i++){
            if (i%2 ==0) {
                System.out.println( "Even numbers:" +i);
                
            }else{
                System.out.println("Odd numbers" +i);
            }
        }
    }

    
}