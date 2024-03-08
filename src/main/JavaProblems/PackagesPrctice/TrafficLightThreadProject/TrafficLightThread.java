package PackagesPrctice.TrafficLightThreadProject;

import java.util.concurrent.ThreadLocalRandom;

public class TrafficLightThread extends Thread{
    private final TrafficColor color;

    public TrafficLightThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n", color);
        try {
            Thread.sleep(color.getOnTimeMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n", color);
    }
}
