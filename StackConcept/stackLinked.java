package StackConcept;

import java.util.Scanner;

class linkedNodes  {
    int data;
    linkedNodes next;
    linkedNodes top = null;

    linkedNodes(){}
    linkedNodes(int data,linkedNodes next){
        this.data = data;
        this.next = next;
    }
    void insertData(Scanner sc){

        System.out.println("Enter a Value:");
        int val = sc.nextInt();
        linkedNodes node = new linkedNodes(val,top);
        top = node;


    }

    void pop(){
        if (top == null){
            System.out.println("Stack is underflow");
        }else{
            System.out.println("Popped Element:" +top.data);
            top = top.next;
        }

    }

    void peek(){
        if (top ==  null){
            System.out.println("Stack is underflow");
        }else{
            System.out.println("Top  Element in stack1:" +top.data);
        }
    }

    void displayStackData(){
        linkedNodes temp = top;
        while (temp != null){
            System.out.println("data:" + temp.data);
            temp = temp.next;
        }
    }

}

public class stackLinked {
    static void main() {
        Scanner sc = new Scanner(System.in);
        linkedNodes obj = new linkedNodes();
        while (true){
            System.out.println("1.Inserting");
            System.out.println("2.Displaying");
            System.out.println("3.(POP)Remove Top of the Element");
            System.out.println("4.(Peek)Return Top of the Element");
            System.out.println("----------------------------------------------------");
            System.out.println("Enter a choice:");
            int n = sc.nextInt();
            switch (n){
                case 1:
                    obj.insertData(sc);
                    break;
                case 2:
                    obj.displayStackData();
                    break;
                case 3:
                    obj.pop();
                    break;
                case  4:
                    obj.peek();
                    break;


            }

        }





    }
}
