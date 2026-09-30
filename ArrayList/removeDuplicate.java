package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class removeDuplicate {
    static void main() {
        Scanner scan = new Scanner(System.in);
        ArrayList li = new ArrayList<>();
        int n=6;
        for(int i=0;i<n;i++){
            li.add(scan.nextInt());
        }


        for (int i=0;i<n;){
            if (li.contains(li.get(i)) && li.indexOf(li.get(i)) !=i){
                li.remove(i);
                n--;
            }else{
                i++;
            }
        }
        System.out.print(li);







    }
}
