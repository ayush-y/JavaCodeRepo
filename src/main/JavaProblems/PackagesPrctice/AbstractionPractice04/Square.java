package PackagesPrctice.AbstractionPractice04;

public class Square extends Shape{
    private final double sideInCm;

    public Square(double sideInCm) {
        this.sideInCm = sideInCm;
    }

    public double getSideInCm() {
        return sideInCm;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideInCm, 2);
    }
}
