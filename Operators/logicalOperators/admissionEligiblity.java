package logicalOperators;

import java.util.Scanner;

public class admissionEligiblity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Marks:");
        int mark = scan.nextInt();
        System.out.println("Enter a Attendance:");
        int attendance = scan.nextInt();

        if (mark>=60 && attendance>=75) {
            System.out.println(" Congratulation Your are Eligble for Admission:"); 
        }else{
            System.out.println("sorry your not Eligble for Admission");
        }
        scan.close();
    }
}
