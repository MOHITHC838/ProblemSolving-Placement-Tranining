public class strongnumber {
    
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return fact(n-1)*n;
    }
    public static void main(String[] args) {
        int input = 145;
        int rev=0;
        int fact =0;
        while (input>0) {
            rev =input%10;
            input=input/10; 

            fact += fact(rev);
        }
        System.out.println(fact); 
        
        
        if (fact == input){
            System.out.println(" this is a strong number");
        }else{
            System.out.println(" this is  not a strong number");

        }
         
       

       
    }
}
