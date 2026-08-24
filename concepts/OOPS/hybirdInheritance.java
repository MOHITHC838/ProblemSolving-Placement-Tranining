package concepts.OOPS;

class A
{
    int a =10;

}
class B extends A
{
    int b=20;

}
class C extends A
{
    int c=30;

}
class D extends B{
    int d=40;

}
class e extends C{
    int e =50;

}
class F extends e{
    int f = 60;
}



public class hybirdInheritance { 
    public static void main(String[] args) {
        F fobj = new F();
        System.out.println(fobj.a);
        System.out.println(fobj.c);
        System.out.println(fobj.e);
        System.out.println(fobj.f);


        D dobj =  new D();
        System.out.println(dobj.a);
        System.out.println(dobj.b);
        System.out.println(dobj.d);

    }
}
