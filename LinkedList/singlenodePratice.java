package LinkedList;

import java.util.Scanner;

class singleNode{
    singleNode head = null,tail = null;
    int data;
    singleNode next;
    singleNode(){}

    singleNode(int data,singleNode next){
        this.data = data;
        this.next = next;
    }
    void insertData(Scanner sc){
        System.out.println("Enter a element to insert:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            singleNode node = new singleNode(val,null);

            if(head == null){
                head = node;
                tail = node;
            }else{
                tail.next = node;
                tail = node;

            }
        }

    }
    void displayNode(){
        singleNode temp = head;
        System.out.println("-------------------------------------------------------");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    void insertBeetween(Scanner sc){
        System.out.println("Enter a position to insert:");
        int pos = sc.nextInt();
        System.out.println("Enter a element to insert");
        int val = sc.nextInt();
        singleNode nodes = new singleNode(val,null);
        singleNode temp = head;
        if(pos==1){
            nodes.next = head;
            head = nodes;

        }else{
        for(int i=0;i<pos-2;i++){
           temp =temp.next;
        }
        nodes.next = temp.next;
        temp.next = nodes;
        }

        if (temp.next == null){
            temp.next =nodes;
        }
    }

    void reversedNode(){
        singleNode curr = head;
        singleNode prev = null;

        while(curr != null){
            singleNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head= prev;

    }


}


public class singlenodePratice
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleNode obj = new singleNode();
        obj.insertData(sc);
        obj.displayNode();
//        obj.insertBeetween(sc);
//        obj.displayNode();
        obj.reversedNode();
        obj.displayNode();
    }
}
