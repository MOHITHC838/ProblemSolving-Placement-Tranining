package LinkedList.CircularSingleLinkedList;


import java.util.Scanner;

class  circularNode{
    circularNode head = null,tail = null;
    int data;
    circularNode next;

    circularNode(){}
    circularNode(int data,circularNode next){
        this.data =  data;
        this.next = next;
    }
    void insert(Scanner sc){
        System.out.println("Enter a number of Element to insert:");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int val = sc.nextInt();
            circularNode node = new circularNode(val,null);
            if (head == null){
                head = node;
                tail = node;
            }else{
                tail.next = node;
                tail = node;
            }

        }
        if (tail.next == null){
            tail.next = head;
        }
        System.out.println("--------------------------------------------------");

    }

    void displaying(){
        circularNode temp = head;
        do {
            System.out.println("Node Datas: "+temp.data);
            temp =  temp.next;
        }
        while (temp != head);
        System.out.println("--------------------------------------------------");

    }


    void insertBetWeen(Scanner sc){
        System.out.println("Enter a  position To Insert:");
        int pos = sc.nextInt();
        System.out.println("Enter a element to insert:");
        int val = sc.nextInt();
        circularNode temp = head;
        circularNode newNode = new circularNode(val,null);
       if (pos==1){
           newNode.next = temp;
           head = newNode;
           tail.next = newNode;
       }else{
           for (int i=0;i<pos-2;i++){
               temp = temp.next;

           }
           newNode.next = temp.next;
           temp.next = newNode;
       }
       if (temp.next == head){
           temp.next = newNode;
           newNode.next = head;
       }
       System.out.println("--------------------------------------------------");

    }
//    void reversed(){
//        circularNode prev;
//        circularNode curr;
//
//    }


    void deleteNode(Scanner sc){
        circularNode temp = head;
        System.out.println("Enter a position to delete:");
        int pos = sc.nextInt();
        if (pos ==1){
            head = temp.next;
            tail.next = head;
            tail = head;
        }else{
            for (int i=0;i<pos-2;i++){
                temp = temp.next;
            }
            temp.next= temp.next.next;

            if(temp.next.next == head){
                temp.next = head;
                tail = temp;
            }
        }



    }

}



public class circularOpeation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        circularNode obj = new circularNode();
        while (true){
//            System.out.println("--------------------------------------------------");
            System.out.println("1.Inserting Data");
            System.out.println("2.Displaying Data");
            System.out.println("3.Inserting firts,last,Middle");
            System.out.println("4.Delete Node");
            System.out.println("Enter a your choice:");
            System.out.println("--------------------------------------------------");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    obj.insert(sc);
                    break;
                case 2:
                    obj.displaying();
                    break;
                case 3:
                    obj.insertBetWeen(sc);
                    break;
                case 4:
                    obj.deleteNode(sc);
                    break;
            }
        }




    }
}
