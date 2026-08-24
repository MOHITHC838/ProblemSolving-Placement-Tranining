public class primeNumber {
    public static void main(String[] args) {
        int input =4;
        int count =0;

        for(int i=1;i<=input;i++){
            if(input % i ==0){
                System.out.println("this is a prime number");
            }
            else{
                System.out.println(" this is not a prime number");
            }
            count++;

        }
        System.out.print(count);
        
    }
    
}
