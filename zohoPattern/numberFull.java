package zohoPattern;

public class numberFull {
    public  static void main() {
        int n=5;
        int count=1;
        for (int i=1;i<=n;i++){
            if(i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(count +" ");
                    count++;
                }
                System.out.println();
                count = count+5;
            }else{
                for(int j=1;j<=n;j++) {
                    count--;
                    System.out.print(count +" ");
                }

                System.out.println();
                count = count+5;
            }


        }


    }

}
