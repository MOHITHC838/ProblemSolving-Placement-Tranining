package OOPS.Inheritence;

class Animal1{
    void  eat(){
        System.out.println("All animal can Eat!");
    }

}

class Monkey extends Animal1{
    void barks(){
        System.out.println("monkey make sound!");
    }

}

class  puppy extends  Animal1{
    void weep(){
        System.out.println("puppy weep");
    }

}


public class hierachicalInheritence {
    public  static void main(String [] args){
       puppy obj = new puppy();
       obj.weep();
       obj.eat();
       System.out.println("----------------------------------");
       Monkey ob = new Monkey();
       ob.barks();
       ob.eat();


    }
}
