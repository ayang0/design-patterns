package thread.test.create;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());
        }
        executorService.shutdown();
        System.out.println("---------------------");
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 20; i++) {
            executorService1.execute(new MyRunnable());
        }
        executorService1.shutdown();

        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService2.execute(new MyRunnable());
        executorService2.shutdown();
    }
}
