package Leetcode;
import java.util.Scanner;

class single
{
    single head = null;
    single tail = null;
    int data;
    single next;
    single(){}
    single(int data,single next){
        this.data= data;
        this.next = next;
    }

    void insert(Scanner sc){
        System.out.println("Enter a number of element to insert:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            single nodedata = new single(val,null);
            if (head ==null){
                head = nodedata;
                tail = nodedata;
            }else {
                tail.next = nodedata;
                tail = nodedata;
            }
        }


    }
    int max=0;
    int min =Integer.MAX_VALUE;
    double sum =0;
    double avg =0;
    double count=0;
    void display(){
        single temp = head;
        while (temp != null){
            sum += temp.data;
            count++;
            avg = sum/count;

            if (temp.data > max){
                max = temp.data;
            }

            if (temp.data < min){
                min = temp.data;
            }


            temp =  temp.next;
        }
        System.out.println("Height:"+max);
        System.out.println("lowest:"+min);
        System.out.println("Averge:"+avg);
    }
    void serchPosition(Scanner sc){
        int markCount=0;
        System.out.println("Enter a mark:");
        int mark = sc.nextInt();
        single temp = head;
        while (temp != null){
            if (temp.data == mark){
                markCount++;
                System.out.println("Search Position:" +markCount);
            }else{
                markCount++;

            }
            temp = temp.next;
        }
    }
    void aboveAvg(){
        int aboveAvg =0;
        single temp = head;
        while (temp != null){
            if (temp.data > avg){
                aboveAvg++;
            }
            temp= temp.next;
        }
        System.out.println(aboveAvg);


    }
}
public class studentMarkList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        single obj = new single();
        obj.insert(sc);
        obj.display();
        obj.serchPosition(sc);
        obj.aboveAvg();
    }
}
