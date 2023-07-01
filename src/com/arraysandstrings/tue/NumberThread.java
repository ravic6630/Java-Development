package com.arraysandstrings.tue;

public  class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        System.out.println("Thread");
        numberThread.start();

    }
}
