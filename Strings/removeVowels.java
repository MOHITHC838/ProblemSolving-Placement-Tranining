package Strings;

public class removeVowels {
    public static void main(String[] args) {
        String input = "beautiful";
        char charArray[] = input.toCharArray();

        String output ="";
        for(int i=0;i<charArray.length;i++){
            char ch = input.charAt(i);
            if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ||  ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' ){
                
            }else{
                output +=ch;
                
            }

            
        }
        System.out.println(output);


    }
}
