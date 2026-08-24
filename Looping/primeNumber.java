package Looping;

public class primeNumber {
    public static  void main(String[] args) {
        int number = 4;
        boolean bool  = false;
        for(int i=1;i<=number;i++){
            if(number % i ==0){
                bool = true;
            }
            else{
                bool = false;
            }
        }
        if (bool) {
            System.out.println("prime");
            
        }else{
            System.out.println("not a prime ");
        }

    }
}
