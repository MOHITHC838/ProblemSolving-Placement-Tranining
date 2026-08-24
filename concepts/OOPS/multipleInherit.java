package concepts.OOPS;

class A{
    int a =10;
   
}
class B extends A{
    int b=20;
    

}
class C extends B{
    int c=30;
   
}














public class multipleInherit {
    public static void main(String[] args) {
        B bobj = new B();
        System.out.println(" I got A Class Value using Bobject " +bobj.a);
        System.out.println(" i got B class value  using Bobject "+bobj.b);

        C cobj =  new C();
        System.out.println("I got A class value using C object " +cobj.a);
        System.out.println("I got b class value using C object " +cobj.b);
        System.out.println("I got C class value using C object " +cobj.c);
        
    }
}
