package PackagesPrctice.AbstractionPractice04;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        Square square = new Square(2.9);

        System.out.printf("Area of circle %5.2f \n",circle.calculateArea());
        System.out.printf("Area of square %5.2f",square.calculateArea());

    }
}
