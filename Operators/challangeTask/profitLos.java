 package challangeTask;

 import java.util.Scanner;;
public class profitLos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Cost Price:");
        int cp = scan.nextInt();

        System.out.println("Enter Your Selling Price:");
        int sp = scan.nextInt();
       
        if(sp>cp){
            int profit = sp - cp;
            System.out.println("You Got A Profit:" +profit);
        }else{
            int loss = cp -sp;
            System.out.println("You Got A Loss:" +loss);
        }
        scan.close();
        
    }

    
}