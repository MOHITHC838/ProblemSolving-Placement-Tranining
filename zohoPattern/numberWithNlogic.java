package zohoPattern;

public class numberWithNlogic {
    static void main() {
        int n=5;
//        Left Part
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n-i+j +" ");
            }

//            right Part
            for(int j=1;j<=n-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
