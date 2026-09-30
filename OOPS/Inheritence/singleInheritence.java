package OOPS.Inheritence;


class Animal{
    void eat(){
        System.out.println("Animal can eat'!");
    }
}

class dog extends Animal{
    void bark(){
        System.out.println("Dog Barking");
    }
}






public class singleInheritence  {
    public  static  void main(String[] args){
        dog obj = new dog();
        obj.bark();
        obj.eat();

    }
}

