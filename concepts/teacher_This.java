package concepts;

public class teacher_This {


    String myName;
    teacher_This(){
        System.out.println("hello");
    }

    void display(String myName){
        this.myName = myName;
        //  above this.myName perform like this -> obj.myName
    }
    public static void main(String[] args) {          
        teacher_This obj = new teacher_This();
        obj.display("mohith");
        System.out.println(obj.myName);
    }
    
}
