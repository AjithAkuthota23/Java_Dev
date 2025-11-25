package Threads;

public class Threads {
    /*
    Thread is a lightweight process that executes a part of your program independently
    A java program always start with one main thread, but you can create additional threads to perform tasks in parallel
    There are two ways to create a thread
    1. By extending Thread class
    2. By implementing Runnable interfaces
    Implementing Runnable interface is a better option since Java doesn't allow multiple inheritances using classes but a class can implement multiple interfaces
    */
    public static void main(String[] args){
        Thread t1=new MyThread();
        Thread t2=new Thread(new MyTask());
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

class MyTask implements Runnable {
    public void run() {
        System.out.println("Running task in: " + Thread.currentThread().getName());
    }
}