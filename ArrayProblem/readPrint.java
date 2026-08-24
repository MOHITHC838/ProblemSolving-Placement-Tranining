package ArrayProblem;


import java.util.Scanner;


public class readPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Array:");
        int inputArray = scan.nextInt();
        int[] array = new int[inputArray];

        for(int i=0;i<=array.length-1;i++){
            array[i]= scan.nextInt();
        }


        scan.close();
    }
}
