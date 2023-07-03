package com.arraysandstrings.tue;

public class Mythread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Mythread numberPrinter = new Mythread();

        Thread thread = new Thread(numberPrinter);
        System.out.println("thread");
        thread.start();

    }
}
