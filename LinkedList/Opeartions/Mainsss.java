package LinkedList.Opeartions;


import java.util.*;

class Node{
    Node head = null,prev=null;
    int data;
    Node address;

    Node(int data,Node add){
        this.data = data;
        this.address= add;
    }

    Node(){

    }

    void insertion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of Element:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            Node obj = new Node(val,null);

            if(head == null){
                head = obj;
                prev=obj;
            }else{
                prev.address = obj;
                prev = obj;

            }

        }
    }

    void insertionBetWeen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Postion to Insert:");
        int Postion = sc.nextInt();
        System.out.println("enter new Value to insert: ");
        int newVal = sc.nextInt();
        Node NewNode = new Node(newVal,null);
        Node temp = head;
        if(Postion == 1){
            NewNode.address = head;
            head = NewNode;

        }else{
            for(int i=0;i<Postion-2;i++){
                temp = temp.address;
            }
            NewNode.address = temp.address;
            if(temp.address == null){
                NewNode.address = temp.address;
                temp.address = NewNode;

            }

        }

    }

    void deleteData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a position to delete:");
        int pos = sc.nextInt();
        Node temp = head;
        if(pos ==1){
            head = temp.address;
        }
        for(int i=0;i<pos-2;i++){
            temp = temp.address;

        }
        temp.address = temp.address.address;
    }
    void displayData(){
        Node temp = head;
        while (temp != null){
            System.out.println("Valuse:" +temp.data);
            temp = temp.address;
        }
    }

}
public class Mainsss
{
    public static void Mainsss(String[] args) {

        Node obj = new Node();
        obj.insertion();
        obj.displayData();
        // obj.insertionBetWeen();
        // obj.displayData();
        obj.deleteData();
        obj.displayData();


    }
}
