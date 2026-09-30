package Threads;

class Mydata extends Thread{
    public void  run(){
        System.out.println("Printing a Data Using Thread!");
    }
}

public class conceptThreads {
    public static void main(String[] args){
        Mydata obj = new Mydata();
        obj.start();

    }
}
