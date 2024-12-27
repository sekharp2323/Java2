package org.example;

import java.lang.Runnable;

class Apple implements Runnable{
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println("Apple is sweet");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            }
}

class Orange implements Runnable{
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println("Orange is Tangy");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }        }
    }
}

public class A13 {
    public static void main(String[] args) {
        Thread tt1=new Thread(()->{
            System.out.println("Lambad Thread");
        });
        tt1.start();

        Apple apple=new Apple();
        Orange orange=new Orange();
        Thread t1=new Thread(apple);
        Thread t2=new Thread(orange);
        t1.start();
        t2.start();

        for (int i=0;i<5;i++) {
            System.out.println("Main thread is running");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("All threads have completed");
    }
}
