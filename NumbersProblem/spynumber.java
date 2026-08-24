public class spynumber {
    public static void main(String[] args) {
        int input =123;
        int sum=0;
        int multiple = 1;

        int rev=0;
        while (input>0) {
            rev = input%10;
            sum += rev;
            multiple *= rev;
            input = input/10;
        }
        if( sum ==multiple ){
            System.out.println(" this is a spy number");

        }else{
            System.out.println(" this is not a spy number");
        }
      
    }
    
}
