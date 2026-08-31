package StringEasy;

public class zohoStringXpattern {
    static void main() {
        String input = "zoho";
        for (int i=0;i<input.length();i++){
            char characters =  input.charAt(i);
            for (int j=1;j<=5;j++){
                for (int k=1;k<=5;k++){
                    if (j==k|| j+k == 6){
                        System.out.print(characters);
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }

        }
    }
}
