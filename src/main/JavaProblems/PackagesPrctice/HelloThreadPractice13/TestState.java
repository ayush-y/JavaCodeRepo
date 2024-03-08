package PackagesPrctice.HelloThreadPractice13;

public class TestState {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("\nCreate the Thread %s",
                t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\nThread Finished %s",
                t1.getState());
    }
}
