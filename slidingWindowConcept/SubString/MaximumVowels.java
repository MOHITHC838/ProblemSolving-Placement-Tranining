package slidingWindowConcept.SubString;

public class MaximumVowels {

    public static void MaximumVowels(String inp,int k){
        int n=inp.length();
        int maxCount =0;
        for (int i=0;i<=n-k;i++){
            int count =0;
            for (int j=i;j<i+k;j++){
                char ch = inp.charAt(j);
                if (ch =='a'|| ch =='e'|| ch =='i'||ch =='o'||ch =='u') {
                    count++;
                }
            }
            if (maxCount < count){
                maxCount = count;
            }
        }
        System.out.println("The maximum  vowel count is :"+maxCount);
    }

    public static void main(String[] args){
        String str = "abciiidef";
        MaximumVowels(str,3);
    }
}
