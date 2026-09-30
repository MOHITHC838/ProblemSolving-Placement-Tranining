package StackConcept;


import java.util.Scanner;

class stackMethods{
    int n =5;
    int[] stack = new int[n];
    int top = -1;

    void push(Scanner sc){
        System.out.println("Enter a value to insert in stack:");
        int val = sc.nextInt();

        if(top == n-1){
            System.out.println("Stack OverFlow!!!");
        }else{
            stack[++top] = val;
        }
        System.out.println("-------------------------------------");

    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is empty(Underflow)");
        }else{
            System.out.println("Popped Element:" +stack[top]);
            top--;
        }
        System.out.println("-------------------------------------");

    }

    void peek(){
        if(top == -1){
            System.out.println("stack is empty(Underflow)");
        }else{
            System.out.println("Top of the value in Stack:" +stack[top]);
        }
        System.out.println("-------------------------------------");

    }

    void displayStackValue(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
        System.out.println("-------------------------------------");
    }
}

public class StackfuncationImplement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        stackMethods obj = new stackMethods();
        boolean isBool = true;
        while(isBool){
            System.out.println("--------Stack Method Implementations------");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            int n = sc.nextInt();

            switch(n){
                case 1:
                    obj.push(sc);
                    break;

                case 2:
                    obj.pop();
                    break;

                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.displayStackValue();
                    break;

                default:
                    isBool = false;
                    System.out.println("Enter a correct choice please again!!!");

            }
        }


    }
}
