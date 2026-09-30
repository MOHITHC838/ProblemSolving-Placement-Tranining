package Threads;


class  Threads1 extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Runnable Thread One: "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);

            }

        }
    }
}


class  Threads2 extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Main Thread Two: "+i);
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e);

            }

        }
    }
}




public class ThreadTasks {
    static void main() throws InterruptedException {
        Threads1 obj1 = new Threads1();
        obj1.start();
        obj1.join();
        Threads2 obj2 = new Threads2();
        obj2.start();
        obj1.join();

    }
}
