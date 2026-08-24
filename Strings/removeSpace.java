package Strings;

public class removeSpace {
    public static void main(String[] args) {
        String input ="Java Is Fun"; 
        String output ="";

        for(int i=0;i<=input.length()-1;i++){
            char ch  = input.charAt(i);
            if (Character.isAlphabetic(ch)) {
                output +=ch;
            
        }
        }
        System.out.println(output);
        


      


        
    }
    
    
}
