package Strings;

public class toggle {
    public static void main(String[] args) {
        String input = "JaVa-9";
        String ouptut ="";
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (Character.isAlphabetic(ch)) {
                if (Character.isUpperCase(ch)) {
                    ouptut += Character.toLowerCase(ch); 
                }else{
                    ouptut += Character.toUpperCase(ch);
                }    
            }else{
                ouptut +=ch;
            }
        }
        System.out.println(ouptut);

                        
    }
}
