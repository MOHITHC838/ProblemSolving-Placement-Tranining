package slidingWindowConcept.SubString;

public class subString {


    public static void subStringTraverse(String inp,int k){
        int n=inp.length();
        for (int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                System.out.print(inp.charAt(j));
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        String input = "abcde";
        subStringTraverse(input,3);
    }
}
