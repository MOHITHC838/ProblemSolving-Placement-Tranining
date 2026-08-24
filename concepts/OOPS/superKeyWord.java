package concepts.OOPS;


class Employee{
    String name;

    Employee(String name){
        this.name =  name;

    }
}
class payments extends Employee{
    int salary;
    payments(String name,int Salary){
        super(name);
    }
}



public class superKeyWord {
    public static void main(String[] args) {
        payments obj = new payments("mohith", 12);
        System.out.println(obj.name);
        
    }
}
