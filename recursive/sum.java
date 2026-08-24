package recursive;

public class sum {
    public static void main(String[] args) {

        System.out.print(sum(5));
        
    } 

    public static int sum(int a){

        if (a < 1) {
            return 0;   
        }

        return sum(a-1) + a;
       
       
    }    
}

