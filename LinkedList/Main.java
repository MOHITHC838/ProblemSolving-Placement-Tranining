
package LinkedList;


import java.util.*;

class Node {
    Node head = null,prev=null;
    int val;
    Node next;

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    Node() {

    }

    // insertion methods
    void insertion(Scanner scan) {
        System.out.println("Enter a number of element: ");
        int val = 0;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            val = scan.nextInt();
            Node obj = new Node(val, null);
            if (head == null) {
                head = obj;
                prev = obj;
            } else {
                prev.next = obj;
                prev = obj;
            }
        }

    }

    // Insertion Postion
    void insertPositionBetween(Scanner scan) {
        System.out.println("Enter a value: ");
        int val = scan.nextInt();
        System.out.println("Enter The Postion:");
        int Postion = scan.nextInt();
        Node newNode = new Node(val, null);

        if (Postion == 1) {
            newNode.next = head;
            head= newNode;
        }else {
        Node temp = head;
        for (int i = 0; i < Postion - 2; i++) {
            temp = temp.next;
            //i=0=>temp->1000;
            //i=1=>temp->2000;
            //i=2=>temp->3000;
        }if (temp.next == null){
            prev = newNode;
            }
        //temp=3000;
        newNode.next = temp.next;
        temp.next = newNode;
    }

}

    // display methods
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println("values:" +temp.val);
            temp = temp.next;
        }
    }
    void delete(Scanner scan){
        System.out.println("Enter position To delete:");
        int n = scan.nextInt();
        Node temp =head;
        for(int i=0;i<n-2;i++){
            temp.next = temp.next.next;

        }

    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node obj = new Node();
        obj.insertion(scan);
        obj.display();
//        obj.insertPositionBetween(scan);
//        obj.display();
//        obj.delete(scan);
    }
}
