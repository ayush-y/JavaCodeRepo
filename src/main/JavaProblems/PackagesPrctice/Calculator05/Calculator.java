package PackagesPrctice.Calculator05;

public class Calculator {
    public int add(int a, int b){
        return  a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double first, double second){
        return first + second;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(3.0, 2.0));
    }
}
