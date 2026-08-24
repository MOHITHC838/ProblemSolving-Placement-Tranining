
public class Reverse {
    public static void main(String[] args){
        int input = 12345;
        System.out.println("input:"+ input);
        int rev =0;
        int ouput = 0;
        while (input>0) {
             rev =(rev * 10)+ input%10;
            input = input/10;
            ouput =rev;
        }
        System.out.print ("ouput"+ ouput);




    }
    
}
