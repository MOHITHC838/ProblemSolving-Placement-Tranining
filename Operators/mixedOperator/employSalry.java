package mixedOperator;

import java.util.Scanner;
public class employSalry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The basic salary For everyOne:30000");
        System.out.println("HRA:20%");
        System.out.println("DA:10%");
        System.out.println("PF:5%");
        int basicsalary = 30000;

        int hraSalry = 30000*20/100;
        System.out.println("This is a HRA 20% amount:" +hraSalry);
        int finalhraSalry =basicsalary + hraSalry;
        System.out.println(finalhraSalry);

        int da = 30000*10/100;
        System.out.println("This is Da 10% amout" +da);
        int finalDASalry =basicsalary + da;
        System.out.println(finalDASalry);


        int pf = 30000*5/100;
        System.out.println("This is pf 5% amout" +pf);
        int finalPFSalry =basicsalary + pf;
        System.out.println(finalPFSalry);

        scan.close();
    }
}
