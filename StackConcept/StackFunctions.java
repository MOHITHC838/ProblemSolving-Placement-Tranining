package StackConcept;
import  java.util.*;

class StackImplement{
    int n =10;
    int[] stackVariable  = new int[n];
    int top = -1;

    void push(Scanner sc){
        System.out.println("Enter a  value:");
        int val = sc.nextInt();
        if (top == n-1){
            System.out.print("stack overflow");
        }else {
            top++;
            stackVariable[top] = val;
        }
        System.out.println("---------------------------------------");
    }
    void pop(){
        if (top == -1){
            System.out.print("Stack is underflow Or Empty");
        }else{
            System.out.println("poped Values:" +stackVariable[top]);
            top--;
        }
        System.out.println("---------------------------------------");
    }

    void display(){
        if (top == -1){
            System.out.println("Stack is empty");
        }
        for(int i=top;i>=0;i--){
            System.out.println("stack data: "+stackVariable[i]);
        }
    }

    public  boolean isEmpty(){
        if (top == -1){
            System.out.println("Stack is underFloew");
            return true;

        }
        System.out.println("Stack is Not empty");
        return false;

    }

}
public class StackFunctions {
    static void main() {
        Scanner sc = new Scanner(System.in);
        StackImplement obj = new StackImplement();

        while (true){

            System.out.println("1.Push");
            System.out.println("2.pop");
            System.out.println("3.Display");
            System.out.println("4.Check Stack Empty or Not");
            System.out.println("---------------------------------------");
            System.out.println("Enter a choice");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    obj.push(sc);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    System.out.println(obj.isEmpty());

            }
        }
    }
}
