package PackagesPrctice.TrafficLightThreadProject;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeMills;

    public int getOnTimeMills() {
        return onTimeMills;
    }

    TrafficColor(int onTimeMills) {
        this.onTimeMills = onTimeMills;
    }
}
