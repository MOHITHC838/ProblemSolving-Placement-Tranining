package zohoPattern;

public class XpatternNumber {
    static void main() {
        int n = 5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i ==j){
                    System.out.print(i);
                } else if (i+j ==6) {
                    System.out.print(j);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }







    }

}
