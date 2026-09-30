package OOPS.Abstraction;


abstract class Emoployee{
     abstract void display();

     void  demo(){
         System.out.println("We can create Normal method in abstract class" );
     }
}

class worker extends Emoployee{
    void display(){
        System.out.println("I created defintion or body using detrived  class");
    }
}






public class abstrctConceptDemo {
    public static void main(String[] args){
        worker obj = new worker();
        obj.display();
        obj.demo();





//        Abstract methood only having a declaration like (public  void display;)
//        absrtct definition  or Body will wriiten in detrived class
//        abstract contains atleast one abstract method
//        we cannot create object for abstract class
    }
}
