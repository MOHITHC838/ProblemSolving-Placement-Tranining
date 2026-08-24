package zohoPattern;

public class rightSideNo {

    static void main() {

        int n = 5;
        int start = 11;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            int l = start;
            int c = n - i + 2;

            for (int j = 1; j <= i; j++) {

                System.out.print(l + " ");

                l = l + c;
                c++;
            }

            System.out.println();

            // next row starting value
            start = start - (n - i);
        }
    }
}