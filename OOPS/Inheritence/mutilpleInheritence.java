package OOPS.Inheritence;

interface AA{
    void display();

}

interface BB{
    void display();

}
class CC implements AA,BB{
    public  void display(){
        System.out.println("Class c");
    }

}

public class mutilpleInheritence {
    public static  void main(String [] args){
        CC obj = new CC();
        obj.display();

    }
}
