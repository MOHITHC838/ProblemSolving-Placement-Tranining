package StackConcept;

class stack{
    char[] alpheatStack = new char[100];
    char[] otherStack = new char[100];

    int alptop =-1;
    int otherTop = -1;

    int length=0;

    void insertData(String input){
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch >= 'a' && ch <='z' || ch >= 'a' && ch <='z'){
                alptop++;
                alpheatStack[alptop]  = ch;
            }else{
                otherTop++;
                otherStack[otherTop]  = ch;
            }
        }

    }
    void displayAlpheat(){
        for(int i=alptop; i>=0;i--){
            System.out.print(alpheatStack[i]);
        }
        System.out.println();
    }


    void displayOther(){
        for(int i=otherTop; i>=0;i--){
            System.out.print(otherStack[i]);
        }
    }
}
public class StackProblem
{
    public static void main(String[] args) {
        String input = "ab@cdb-0tx";
        stack obj = new stack();
        obj.insertData(input);
        obj.displayAlpheat();
        obj.displayOther();
    }
}
