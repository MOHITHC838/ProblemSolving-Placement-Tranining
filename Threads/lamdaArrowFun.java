package Threads;

import Hashmap.SubString;

public class lamdaArrowFun {
    static void main() {
        Thread obj1 = new Thread(()->{
            System.out.println("Hello");
        });

        Thread obj2  = new Thread(()->{
            System.out.println("Hii");
        });
        System.out.println("one");
        obj1.start();
        obj2.start();
        System.out.println("Two");

    }
}
