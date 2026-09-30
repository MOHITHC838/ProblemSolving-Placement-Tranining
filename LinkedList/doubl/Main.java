package LinkedList.doubl;
import java.util.*;

class doubleLinkNode {
    doubleLinkNode head = null,tail = null;
    doubleLinkNode prev;
    int data;
    doubleLinkNode next;

    doubleLinkNode(){}


    doubleLinkNode(doubleLinkNode prev,int data, doubleLinkNode next){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }

    void inserting(Scanner sc){
        System.out.println("Enter a number element to insert:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            doubleLinkNode obj = new doubleLinkNode(null,val,null);
            if(head == null){
                head = obj;
            }else{
                obj.prev = obj;
                tail.next=obj;
            }
            tail=obj;
        }
    }

    void displayData(){
        doubleLinkNode temp = head;

        while(temp != null){
            System.out.println("values:" +temp.data);
            temp = temp.next;
        }
    }
    void insertBtween(Scanner sc){
        System.out.println("Enter a position:");
        int pos = sc.nextInt();
        System.out.println("Enter a  number to insert:");
        int n = sc.nextInt();
        doubleLinkNode newNode = new doubleLinkNode(null,n,null);

        doubleLinkNode temp = head;
        for(int i=1;i<=pos-2;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doubleLinkNode obj = new doubleLinkNode();
        obj.inserting(sc);
        obj.displayData();
        obj.insertBtween(sc);
        obj.displayData();
    }
}

