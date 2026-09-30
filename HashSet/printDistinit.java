package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class printDistinit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int demo : arr) {
            if (!unique.add(demo)) {
                duplicates.add(demo);
            }
        }

        unique.removeAll(duplicates);

        System.out.println("Unique");
        System.out.println(unique);
        System.out.println("Duplicate");
        System.out.println(duplicates);
    }
}