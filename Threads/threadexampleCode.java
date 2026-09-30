package Threads;

class  MyData extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Runnable: "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);

            }

        }
    }
}



public class threadexampleCode {
    static void main() {
        MyData obj = new MyData();
        obj.start();
        for (int i=1;i<=5;i++){
            System.out.println("Main: "+i);
        }

    }
}
