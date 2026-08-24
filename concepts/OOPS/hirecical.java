package concepts.OOPS;


class A{
    int a=10;
}

class B extends A{
    int b=20;
}

class C extends A{
    int c=30;
}




public class hirecical {
    public static void main(String[] args) {
        C obj =  new C();
        System.out.println(obj.a);
        System.out.println(obj.c);
        
        B obj2 =  new B();
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        
    }
}
