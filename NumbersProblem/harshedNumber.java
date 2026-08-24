public class harshedNumber {
    public static void main(String[] args) {
        int input = 18;
        int userInput = input;
        int rev=0;
        int sum=0;
        while (input>0) {
            rev = input%10;
            sum += rev;
            input= input/10; 
        }
        if(userInput % sum == 0){
            System.out.println(" this is harshed number");
        }else{
            System.out.println(" this is not harshed number");
        }
        System.out.println(sum);
    }
    
}
