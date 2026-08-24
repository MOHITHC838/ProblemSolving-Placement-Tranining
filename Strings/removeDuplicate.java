package Strings;

public class removeDuplicate{
    public static void main(String[] args) {
        String input = "programming";
        String output = "";
        boolean isbool = false;
        for(int i=0;i<=input.length()-1;i++){
            for(int j=i-1;j<=input.length()-1;j++){
                if (input.charAt(i) == input.charAt(j)) {
                    isbool = true;

                    
                }

            }if (isbool) {
                output += input.charAt(i);
                
            }


        }
        System.out.println(output);
        
    }
}