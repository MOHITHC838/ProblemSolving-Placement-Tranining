package LinkedList.PraticeSum;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node head = null,prev = null;
    Node(){}
    Node(int data,Node next){
        this.data = data;
        this.next=next;
    }

    void insertingValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of Value:");
        int n = sc.nextInt();
        int val =0;
        for(int i=0;i<n;i++){
            val =sc.nextInt();

            Node nodeObj = new Node(val,null);
            Node temp = head;
            if (head == null){
                head =  nodeObj;
                prev = nodeObj;
            }else{
                prev.next = nodeObj;
                prev = nodeObj;
            }
        }

    }
    Boolean isVal = false;
    void displayValue(){
        Scanner sc = new Scanner(System.in);
        Node temp = head;
        System.out.println("Enter a Target:");
        int target = sc.nextInt();

        while (temp != null){
            if (temp.data == target){
                isVal = true;
            }
            temp = temp.next;
        }

        if (isVal){
            System.out.println("founded");
        }else{
            System.out.println("Not Founded");
        }
    }


}




public class findValue {
    public static  void main(String[] args){
        Node obj = new Node();
        obj.insertingValue();
        obj.displayValue();

    }

}
