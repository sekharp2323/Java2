package org.example;

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running via Runnable thread");
    }
}

public class A10 {
    public static void main(String[] args) {
        // Create an instance of MyThread1 (which implements Runnable)
        MyThread1 t1 = new MyThread1();

        // Pass the Runnable instance to the Thread constructor
        Thread thread1 = new Thread(t1);

        // Start the thread
        thread1.start();

        // Optionally, you can join the thread to ensure it completes before main finishes
        try {
            thread1.join(); // Wait for thread1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
