package StringEasy;

public class dimondnumber {
    static void main() {
        int n=5;
        int count =1;
        for(int i=1;i<=n/2+1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(count +" ");
                count++;
            }
            System.out.println();

        }


    }
}
