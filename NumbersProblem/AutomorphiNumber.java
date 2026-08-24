public class AutomorphiNumber {
    public static void main(String[] args) {
        int input = 25;
        int square = input*input;
        int lastTwoDigit = square % 100;

        if(input == lastTwoDigit ){
            System.out.println(" this is  AutomorphiNumber");
        }
        else{
            System.out.println(" this is not a AutomorphiNumber");
        }
    }
    
}
