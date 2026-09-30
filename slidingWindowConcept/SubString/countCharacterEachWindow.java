package slidingWindowConcept.SubString;

public class countCharacterEachWindow {

    public static void countCharacter(String inp,int k){
        int n = inp.length();

        for (int i=0;i<=n-k;i++){
            int count =0;
            for (int j=i;j<i+k;j++){
                System.out.print(inp.charAt(j) +" : ");
                count++;
            }
            System.out.println(count);

        }

    }


    public static void main(String[] args){
        String input = "abcde";
        countCharacter(input,3);
    }
}
