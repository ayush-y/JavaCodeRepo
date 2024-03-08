package PackagesPrctice.ChallangeProblem01.Geometry;

import PackagesPrctice.ChallangeProblem01.utils.Circle;
import PackagesPrctice.ChallangeProblem01.utils.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rec = new Rectangle(10, 5);
        double circArea = Math.PI*Math.pow(cir.radius,2);
        double recAre = rec.length* rec.breadth;
        System.out.printf("Area of Rectangle is : %f, Area of circle is %f", circArea, recAre);
    }
}
