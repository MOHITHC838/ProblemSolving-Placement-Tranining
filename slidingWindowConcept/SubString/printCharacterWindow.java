package slidingWindowConcept.SubString;

public class printCharacterWindow {

    public static void printCharacter(String input,int k){

        int n= input.length();
        for (int i=0;i<=n-k;i++){
            for (int j=i;j<i+k;j++){
                System.out.print(input.charAt(j));
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        String input = "hello";
        printCharacter(input,2);
    }
}
