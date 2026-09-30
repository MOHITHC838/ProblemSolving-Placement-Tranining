package MultiDemesionArray;

public class rigthSqurePatternR10 {
    static void main() {
        int n=5;
        for (int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for (int star=1;star<=n;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
