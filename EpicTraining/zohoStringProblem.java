package EpicTraining;

public class zohoStringProblem {
    static void main() {
        String input = "1011100101";
        for(int i=0;i<input.length();i++){
            int sum=0;
            for (int j=i;j<input.length();j++){
                if (input.charAt(j) == '1'){
                    sum++;
                }else {
                    sum--;
                }
            }
            System.out.println(sum);
        }
    }
}
