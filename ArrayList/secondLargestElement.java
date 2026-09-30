package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class secondLargestElement {
    static void main() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> li =  new ArrayList<>();
        int n=5;
        for(int i=0;i<n;i++){
            li.add(scan.nextInt());
        }

        int largest = Integer.MIN_VALUE;
        int secondmax = -1;
        for(int i=0;i<n;i++){
            if (li.get(i) > largest){
                secondmax = largest;
                largest = li.get(i);
            }else if(largest > li.get(i) && li.get(i) > secondmax){
                secondmax = li.get(i);

            }
        }
        System.out.println("The largest Element is :" +largest);
        System.out.print("The second Laregest Element is :"+secondmax);
    }
}
