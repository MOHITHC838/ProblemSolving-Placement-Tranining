
public class amstrong {
    public static void main(String[] args) {
        int rev=0;
        int output=0;
        int input = 153;
        int n=input;
        while (input>0) {
            rev = input%10;
            output +=  rev*rev*rev;
            input = input/10;            
        }
        if(n == output){
            System.out.print("this is amstrong number");
        }
        else{
            System.out.print("not a amstrong number");
        }
    }
    
}
