package LinkedList.doubl;



import java.util.Scanner;

class doublyLinked{
    doublyLinked head=null,tail=null;
    doublyLinked prev;
    int data;
    doublyLinked next;

    doublyLinked(){}

    doublyLinked(doublyLinked prev,int data,doublyLinked next){
        this.prev = prev;
        this.data= data;
        this.next=next;
    }
    void insertData(Scanner sc){
        System.out.println("Enter a number of element to insert:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            doublyLinked node = new doublyLinked(null,val,prev);
            if(head == null){
                head = node;
            }else{
                tail.next = node;
                node.prev = tail;
            }
            tail = node;
        }
        System.out.println("------------------------------------------------------");

    }

    void displayData(){
        doublyLinked temp = head;

        while(temp != null){
            System.out.println("Node Data: "+ temp.data);
            temp=temp.next;
        }
        System.out.println("------------------------------------------------------");

    }

    void insertDataBetween(Scanner sc){
        System.out.println("Enter a position:");
        int pos = sc.nextInt();
        System.out.println("Enter a element to Insert:");
        int val = sc.nextInt();
        doublyLinked newNode = new doublyLinked(null,val,null);
        doublyLinked temp = head;

        if(pos ==1){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }else{
            for(int i=0;i<pos-2;i++){
                temp= temp.next;

            }
            newNode.prev= temp;
            newNode.next=temp.next;
            temp.next = newNode;
        }
        if(temp.next == null){
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println("------------------------------------------------------");

    }

    void reverseNode(){
        doublyLinked temp = tail;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.prev;

        }
    }

    void deleteNode(Scanner sc){
        doublyLinked temp = head;
        System.out.println("Enter a position to delte:");
        int deletepos = sc.nextInt();
        for(int i=0;i<deletepos-2;i++){
            temp = temp.next;
        }
        temp.next= temp.next.next;
        System.out.println("------------------------------------------------------");

    }
}
public class doubleLinkdedList
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doublyLinked obj = new doublyLinked();
        boolean isbool = true;

        while (isbool){
            System.out.println("1.insertData");
            System.out.println("2.DisplayData");
            System.out.println("3.InsertData in Between");
            System.out.println("4.Delete Node");
            System.out.println("5.Reverse Node");
            System.out.println("6.Exit");
            System.out.println("Enter You choice:");
            System.out.println("------------------------------------------------------");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    obj.insertData(sc);
                    break;
                case 2:
                    obj.displayData();
                    break;

                case 3:
                    obj.insertDataBetween(sc);
                    break;
                case 4:
                    obj.deleteNode(sc);
                    break;
                case 5:
                    obj.reverseNode();
                    break;
                default:
                    isbool = false;
                    System.out.println("Enter valid choice");
            }
        }





    }
}

