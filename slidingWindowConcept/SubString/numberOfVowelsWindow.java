package slidingWindowConcept.SubString;

public class numberOfVowelsWindow {
    public static void numberOfVowelsWindow(String inp,int k){
        int n = inp.length();

        for (int i=0;i<=n-k;i++){
            int count =0;
            for (int j=i;j<i+k;j++){
                char ch = inp.charAt(j);
                if (ch =='a'|| ch =='e'|| ch =='i'||ch =='o'||ch =='u') {
                    count++;
                }
            }
            System.out.print(count);
            System.out.println();

        }

    }

    public static void main(String[] args){
        String input = "abcdef";
        numberOfVowelsWindow(input,3);
    }
}
