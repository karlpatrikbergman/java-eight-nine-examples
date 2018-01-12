package chapter1;

import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> threadNameResult = executorService.submit(() -> Thread.currentThread().getName());
        System.out.println(threadNameResult.get());
    }
}
