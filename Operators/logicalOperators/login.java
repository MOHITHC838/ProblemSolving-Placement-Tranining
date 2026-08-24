package logicalOperators;

import java.util.Scanner;;

public class login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Your UserName:");
        String userName = scan.nextLine();
        System.out.println("Enter your password:");
        String passWord = scan.nextLine();

        if (userName.equals("adminw") && passWord.equals("1234")) {
            System.out.println("Login Successfully");    
        }else{
            System.out.println("Wrong username and passWord");
        }
        scan.close();
       
    }
    
}
