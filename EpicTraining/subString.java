package EpicTraining;

public class subString {
    static void main() {
        String input = "hello";
        String target = "llo";

        for(int i=0;i<input.length();i++){
            for(int j=i;j<input.length();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(input.charAt(k));

                }

                System.out.println();
            }
            System.out.println();
        }
    }
}
