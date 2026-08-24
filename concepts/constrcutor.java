package concepts;

public class constrcutor {

    int mark;
    String name;

    //  constrcutor(){
    //     System.out.println("empty constrcutor");
    // }
    // paramaetr constrcutor
    // constrcutor(int a){
    //     System.out.println(a);
    // }

    constrcutor(int a, String b){
        mark = a;
        name = b;
        

    }

    


    public static void main(String[] args) {
        constrcutor obj1 = new constrcutor(12,"mohith");
        constrcutor obj2 = new constrcutor(20,"aswin");

        System.out.println(obj2.mark);
        
        // constrcutor obj2 = new constrcutor();

        // System.out.println(obj.mark);
        // System.out.println(obj.name);

    }

    
}