package ArrayProblem;


import java.util.Scanner;
import java.util.Arrays;

public class ClimbingthelearderBoadrd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a ranker array size:");
        int rankedSize = scan.nextInt();

        int[] rankedArray = new int[rankedSize];

        rankedArray[0]= scan.nextInt();

        for(int i=1;i<rankedSize;){
            int temp = scan.nextInt();
            if(rankedArray[i-1] == temp){
                rankedSize--;
            }else{
                rankedArray[i] = temp;
                i++;
                
            }
        }

       
        System.out.println(Arrays.toString(rankedArray));
    


    }

    
}