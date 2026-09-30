package LinkedList.circulardoublyLinked;

import java.util.Scanner;

class cirDoubly{
    cirDoubly head = null,tail = null;
    cirDoubly prev;
    int data;
    cirDoubly next;
    cirDoubly(){}
    cirDoubly(cirDoubly prev,int data,cirDoubly next){
        this.prev = prev;
        this.data = data;
        this.next = next;

    }
    void insertData(Scanner sc){
        System.out.println("Enter a number of element to insert:");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int val = sc.nextInt();
            cirDoubly node = new cirDoubly(null,val,null);

            if (head == null){
                head = node;
            }else{
                tail.next = node;
                node.prev = tail;

            }
            tail = node;
            tail.next  =  head;
            head.prev = node;

        }
        System.out.println("----------------------------------------------");
    }
    void displayData(){
        cirDoubly temp = head;
        do{
            System.out.println("Node Data: "+temp.data);
            temp = temp.next;

        }while (temp != head);
        System.out.println("----------------------------------------------");
    }


    void insertBetWeen(Scanner sc){
        System.out.println("enter a position to insert:");
        int pos = sc.nextInt();
        System.out.println("Enter a element to insert:");
        int val = sc.nextInt();
        cirDoubly newNode = new cirDoubly(null,val,null);
        cirDoubly temp = head;
        if(pos == 1){
            newNode.prev = temp.prev;
            newNode.next =  temp;
            temp.prev = newNode;
            head = newNode;
            tail.next = head;

        }else{
            for (int i=0;i<pos-2;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next =  newNode;

        }

        if (temp == head){
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }
    void deleteNode(Scanner sc){
        System.out.println("Enter a position to delete:");
        int pos = sc.nextInt();
        cirDoubly temp = head;
        if (pos == 1){
            temp.next.prev = tail;
            head = temp.next;
            tail.next = head;

        }else{
            for(int i=0;i<pos-2;i++){
                temp = temp.next;
            }
            temp.next = tail;
            tail.prev = head;
        }
        if (tail.next == head){
             head.prev = temp;
             temp.next = head;
             tail = temp;
        }

    }
}
public class circular {
    static void main() {
        Scanner sc = new Scanner(System.in);
        cirDoubly obj = new cirDoubly();
        boolean isBool = true;
        while (isBool){
            System.out.println("1.insertData");
            System.out.println("2.displayData");
            System.out.println("3.insertData First,Last,Middle");
            System.out.println("4.Delete Position");
            System.out.println("----------------------------------------------");
            System.out.println("Enter a choice:");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    obj.insertData(sc);
                    break;
                case 2:
                    obj.displayData();
                    break;
                case 3:
                    obj.insertBetWeen(sc);
                    break;
                case 4:
                    obj.deleteNode(sc);
                    break;
                default:
                    isBool = false;
                    System.out.println("enter correct choice");
            }
        }




    }
}
