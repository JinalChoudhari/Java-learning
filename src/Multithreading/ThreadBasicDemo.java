package Multithreading;
class NumberThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    "Thread: " + i
            );

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class ThreadBasicDemo {
    public static void main(String[] args)
            throws InterruptedException {

        NumberThread t = new NumberThread();

        t.start();

        t.join();

        System.out.println("Main thread finished");
    }
}
