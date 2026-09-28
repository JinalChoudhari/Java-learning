package Multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsAndRunnable {
    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            System.out.println(
                    "Task 1: " +
                            Thread.currentThread().getName()
            );
        };

        Runnable task2 = () -> {
            System.out.println(
                    "Task 2: " +
                            Thread.currentThread().getName()
            );
        };

        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();
    }
}
