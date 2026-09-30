package EliteTrainningTasks;

import java.util.Arrays;

public class countFrequency {
    static void main(String[] args) {
        String  input = "programming";

        int[] arr = new int[26];

        for (int i=0;i<input.length();i++){
            char ch =  input.charAt(i);
            int val =  (int)ch - 'a';
            arr[val]++;
        }
        for (int i=0;i<input.length();i++){
            int temp = input.charAt(i) - 'a';
            if (arr[temp] >0){
                System.out.println(arr[temp]  + ":" + (char)(temp+'a'));
                arr[temp] =0;
            }


        }
    }
}
