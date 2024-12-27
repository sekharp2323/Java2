package org.example;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    AtomicInteger count=new AtomicInteger(0);
}

public class A11 {
    public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();
   // Counter counter1=new Counter();
    Thread t1=new Thread(()->{
        //counter.count++;
        System.out.println("For t1 "+counter.count.incrementAndGet());
    });
        t1.start();
        t1.join();

        Counter counter1=new Counter();
    Thread t2=new Thread(()->{
        //counter1.count++;
        System.out.println("For t2 "+counter1.count.incrementAndGet());
    });

    t2.start();
    t2.join();


    }
}
