package PackagesPrctice.HelloThreadPractice13;

public class HelloThread extends Thread{
    private final int threadCount;

    public HelloThread(int threadCount) {
        this.threadCount = threadCount;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) %s Hello from thread- %d\n",(i+1),
                    Thread.currentThread().getName(),threadCount);
        }
    }
}
