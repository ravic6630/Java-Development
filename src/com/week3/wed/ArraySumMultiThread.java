package com.week3.wed;

import java.util.concurrent.*;

public class ArraySumMultiThread {
    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        Future<Integer>[] partialSums = new Future[THREAD_COUNT];

        int Size = ARRAY_SIZE / THREAD_COUNT;
        for (int i = 0; i < THREAD_COUNT; i++) {
            int startIndex = i * Size;
            int endIndex = (i + 1) * Size;

            partialSums[i] = executorService.submit(new PartialSumCalculator(array, startIndex, endIndex));
        }

        int finalSum = 0;
        try {
            for (int i = 0; i < THREAD_COUNT; i++) {
                finalSum += partialSums[i].get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

        System.out.println("Final Sum: " + finalSum);
    }

    private static class PartialSumCalculator implements Callable<Integer> {
        private final int[] array;
        private final int startIndex;
        private final int endIndex;

        public PartialSumCalculator(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public Integer call() {
            int partialSum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                partialSum += array[i];
            }
            return partialSum;
        }
    }
}
