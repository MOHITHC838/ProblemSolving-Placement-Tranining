package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTravese {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int n=scan.nextInt();
        ArrayList<Integer> variable = new ArrayList<>(n);
        System.out.print("Enter a Element:  ");
        for (int i=0;i<n;i++){
            variable.add(scan.nextInt());
        }
        System.out.print(variable);

    }
}
