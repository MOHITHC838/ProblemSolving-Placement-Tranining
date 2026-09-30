package Threads;
class employee{

}
class Mydata4 extends employee implements Runnable{
    public void run(){
        System.out.println("Thread is Running");
    }
}


public class ThreadUseInterface {
    public static void main(String[] args){
        Mydata4 t1 = new Mydata4();
//        t1.run();  without thread object and thread class extends you can use the run methods
//         pass object to the thread class
        Thread th = new Thread(t1); // thread class objects
        th.start();
        System.out.println("In main Methods");
    }
}
