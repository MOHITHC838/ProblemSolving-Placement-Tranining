package Strings;

public class vowelConstantCount {
    public static void main(String[] args) {
        String input =  "HELLO WORLD!";
        int vowelCount =0;
        int constantCount =0;
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (Character.isAlphabetic(ch)) {
                if(ch=='a' ||ch =='e' || ch =='i' || ch == 'o' || ch =='u' || ch =='A' || ch=='E' || ch=='O' ||ch=='I'||ch=='U'){
                    vowelCount++;
            }
              else {
                constantCount++; 
            }       
        }
    }
        System.out.println("Vowel Count is: " +vowelCount);
        System.out.println("Constant count is: " +constantCount);

    }
}
