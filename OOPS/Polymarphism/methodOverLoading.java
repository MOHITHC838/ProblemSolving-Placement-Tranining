package OOPS.Polymarphism;
class add{
    void addition(int a){
        System.out.print("one parameter: ");
        System.out.println(a);

    }

    void addition(int a,int b){
        System.out.print("Two parameter: " );
        System.out.println(a+b);

    }

    void addition(int a,int b,int c){
        System.out.print("Three parameter: ");
        System.out.println(a+b+c);

    }
}
public class methodOverLoading {
    public static void main(String[] args){
    add obj = new add();
    obj.addition(10);
    obj.addition(10,20);
    obj.addition(10,20,30);
    }
}
