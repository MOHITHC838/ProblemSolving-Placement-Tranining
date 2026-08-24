
public class count {
    public static void main(String[] args) {
        int input =987654;
        int rev=0;
        int count =0;
        while (input>0) {
            rev = input%10;
            count+=1;
            input=input/10;
            
        }
        System.out.print("the count is:"+count);
    }
}
