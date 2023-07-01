package com.arraysandstrings.wed;

import java.util.concurrent.*;

public class TicketBookingSystem {
    private static final int TOTAL_TICKETS = 10;
    private static final int THREAD_COUNT = 5;

    private static int availableTickets = TOTAL_TICKETS;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            executorService.execute(new TicketBookingTask("Thread " + (i+1)));
        }

        executorService.shutdown();
    }

    private static class TicketBookingTask implements Runnable {
        private final String threadName;

        public TicketBookingTask(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (TicketBookingSystem.class) {
                    if (availableTickets > 0) {
                        System.out.println(threadName + " is booking ticket " + availableTickets);
                        availableTickets--;
                    } else {
                        break; // No more tickets available
                    }
                }

                try {
                    Thread.sleep(100); // Simulating some processing time for booking
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
