package PackagesPrctice.RunnableExecutorsPractice;

public class PrintNumber implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Number is %d\n", i+1);
        }
    }
}
