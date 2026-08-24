public class sumFactorial {

    public static void main(String[] args) {
        int input = 125;
        int last =0;
        int fact =1;
        int sum =0;
        while (input>0) {
            last = input%10;
            for(int i=1;i<=last;i++){
                fact = fact*i;
            }
            sum += fact;
            fact =1;
            input =  input/10;  
        }
        System.out.println(sum);
    }
}