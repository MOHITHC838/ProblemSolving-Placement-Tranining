package OOPS.Polymarphism;

class App{
     void display(){
        System.out.println("welcome to the Appp!");
    }


}

class demo extends App{
    void display(){
        // super keyWord use for access the parent class behaviours
        super.display();
        System.out.println("Just demo for overridding!");

    }

}






public class methodOverridding {
    public static void main(String[] args){
        demo obj = new demo();
        obj.display();

    }
}
//super keyWord use for call the parent class behaaviour
//        method name should be same
//        parameter should be same
//        return type is also same
// we can incerse the modifier visblity like default to public

//this and super keyWord  only for variable and  methods
// this keyWord refer the current class
// super keyWord refer the parenet class


// this(), super() constrcutors
//this() refer current class constrcutors
//super() refer the parent class constrcutors