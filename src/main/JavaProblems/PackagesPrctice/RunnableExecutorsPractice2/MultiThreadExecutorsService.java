package PackagesPrctice.RunnableExecutorsPractice2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExecutorsService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            SleepTask task = new SleepTask();
            service.submit(task);
        }
        if(!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("EMERGENCY SHUTDOWN");
            service.shutdown();
        }
    }
}
