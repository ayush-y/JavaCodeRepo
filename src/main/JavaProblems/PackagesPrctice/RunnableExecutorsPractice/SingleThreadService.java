package PackagesPrctice.RunnableExecutorsPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        PrintNumber t1 = new PrintNumber();
        service.submit(t1);
        service.shutdown();
    }
}
