package concepts.OOPS;



class A {
    int a =10;
    void display(int a){
        System.out.println( "Class A");
    }
}
 
class B extends A{
    int  b =20;
    void display(){
        System.out.println("Class B");
    }
}













public class singleInherit {
    public static void main(String[] args) {
        B bobj =  new B();
        bobj.display(10);
        System.out.println(bobj.a);
        
    }
    
}
