package OOPS.Inheritence;

class animalss{
    void eats(){
        System.out.println("All animal can Eat!");
    }
}

class dogs extends  animalss{
    void dogbarks(){
        System.out.println("dog abrkings");
    }
}

class cats extends animalss{
    void meowss(){
        System.out.println("cat is meow");
    }
}

class puppies extends dogs{
    void weeps(){
        System.out.println("puppy Weeps");
    }

}
public class hybridInheritence {
    public static void main(String [] args){
        System.out.println("both hierachical and mutlivel inheritence called  as hybird inheritence");
        System.out.println("-----------------------------------------");
        System.out.println("multiLevel Inheritence");
        System.out.println("-----------------------------------------");
        puppies obj1 = new puppies();
        obj1.weeps();
        obj1.dogbarks();
        obj1.eats();

        System.out.println("-----------------------------------------");
        System.out.println("Hybrid inheritence");
        System.out.println("-----------------------------------------");
        dogs obj2 = new dogs();
        obj2.eats();
        obj2.dogbarks();

        System.out.println("-----------------------------------------");

        cats obj3 = new cats();
        obj3.eats();
        obj3.meowss();


    }
}
