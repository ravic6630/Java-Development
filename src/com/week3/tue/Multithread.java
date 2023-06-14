package com.week3.tue;

public class Multithread extends Thread {

    //define the Total No.Of Threads needed
    public static final int TOTAL_THREADS = 10;

    public final static Object obj = new Object();

    int threadNo;
    static int counter = 1;

    public Multithread(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {

        //synchronized block to acquire lock
        synchronized (obj) {

            while (counter <= 10) {


                if (counter == threadNo || (counter % TOTAL_THREADS == threadNo) ||
                        ((counter % TOTAL_THREADS == 0) && (TOTAL_THREADS == threadNo))) {


                    System.out.println(this.threadNo + " printing" + " " + counter++);

                    //notifyAll() notifies all the threads
                   obj.notifyAll();
                } else {

                    //current thread not eligible for printing the current counter value, so wait till its notified
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public static void main(String args[]) {

       //   Creating as many threads as needed.
        for (int i = 1; i <= TOTAL_THREADS; i++) {
            Multithread th = new Multithread(i);
            th.start();
        }
    }
}