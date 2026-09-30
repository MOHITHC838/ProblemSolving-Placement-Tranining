package Leetcode;


import java.util.Scanner;

class ListNode{
    ListNode head =null,prev=null;
    int data;
    ListNode next;

    ListNode(){}
    ListNode(int data,ListNode next){
        this.data = data;
        this.next = next;
    }

    void NodeInsertion(Scanner sc){
        System.out.println("Enter a number of element: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++) {
            int value = sc.nextInt();
            ListNode node = new ListNode(value, null);

            if (head == null) {
                head = node;
                prev = node;
            } else {
                prev.next = node;
                prev = node;
            }
        }
    }

    void displayValues(){
        ListNode temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp  =  temp.next;

        }
    }
    void removeList(int target){
        ListNode temp = head;
        ListNode previous=null;
        while (temp != null){

            if (temp.data == target){
                if (previous == null){
                    head = temp.next;
                }else {
                    previous.next = temp.next;
                }
            }else{
                previous = temp;
            }

            temp= temp.next;

        }



    }



}



public class MainClasess {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ListNode obj = new ListNode();
        obj.NodeInsertion(sc);
        obj.removeList(6);
        obj.displayValues();

    }
}
