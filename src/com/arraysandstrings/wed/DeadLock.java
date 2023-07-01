package com.arraysandstrings.wed;

public class DeadLock {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(new Task1(lock1, lock2));
        Thread thread2 = new Thread(new Task2(lock1, lock2));

        thread1.start();
        thread2.start();
    }

    private static class Task1 implements Runnable {
        private final Object lock1;
        private final Object lock2;

        public Task1(Object lock1, Object lock2) {
            this.lock1 = lock1;
            this.lock2 = lock2;
        }

        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Task1 acquired lock1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println("Task1 acquired lock2");
                }
            }
        }
    }

    private static class Task2 implements Runnable {
        private final Object lock1;
        private final Object lock2;

        public Task2(Object lock1, Object lock2) {
            this.lock1 = lock1;
            this.lock2 = lock2;
        }

        @Override
        public void run() {
            synchronized (lock2) {
                System.out.println("Task2 acquired lock2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock1) {
                    System.out.println("Task2 acquired lock1");
                }
            }
        }
    }
}
