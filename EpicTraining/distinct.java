package EpicTraining;

import java.util.Arrays;

public class distinct {
    static void main() {
        String input = "aab";

        int[] arr = new int[26];

        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            int val = (int)ch - 'a';
            arr[val]++;
        }
        for(int i=0;i<input.length();i++){
            int temp = input.charAt(i) - 'a';
            if (arr[temp] <= 1) {
                System.out.println(arr[temp]  +":" +(char)(temp +97));

            }

        }
    }
}
