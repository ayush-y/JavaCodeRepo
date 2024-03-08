import java.util.stream.IntStream;

class TestingFactLambda {
    public static void main(String[] args) {
        System.out.println("Factorial using two ways !!");
        int number = 9;
        System.out.println(factorial(number));

        IntStream.rangeClosed(2, number)
                .reduce((a,b) -> a*b)
                .ifPresent(System.out::println);
    }
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;

        }
        return fact;
    }
}
