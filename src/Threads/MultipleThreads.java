package Threads;

public class MultipleThreads {
    /*
    Thread Lifecycle: New -> Runnable -> Running -> Blocked/Waiting -> Terminated
    Since threads run independently, rhe output can be in random order
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker(), "Worker-1");
        Thread t2 = new Thread(new Worker(), "Worker-2");

        t1.start();
        t2.start();
    }
}

class Worker implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " → " + i);
        }
    }
}

/*
Various thread methods
1. start() -> Starts a new thread
2. run() -> thread logic
3. sleep(ms) -> Pause execution for --- ms
4. join() -> wait for thread to finish
5. getName() -> get thread name
6. setName() -> rename Thread
7. currentThread() -> returns currently running thread

When two or more threads access shared data, inconsistencies occur, so java provides "Synchronized" keyword
 */