package PackagesPrctice.CallableFactPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       ExecutorService service = Executors.newFixedThreadPool(3);
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            CalculateFactorial task = new CalculateFactorial(i);
            list.add(service.submit(task));
        }
        for (Future<Integer> Future : list) {
            System.out.printf("\n Result is %d", Future.get());
        }
        service.shutdown();
        if(!service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("\nKindly STOP the TASK");
            service.shutdown();
        }
    }
}
