package concepts;



class A extends Thread{
    public void run(){
        System.out.println("Using public void run method  it is run");
    }
}

public class threadConcept {
    public static void main(String[] args) {
        A a1 =  new A();
        a1.start();
        
    }
}
