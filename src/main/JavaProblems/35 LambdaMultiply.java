import java.util.function.BinaryOperator;

class LambdaMultiply {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi = (a,b) -> a * b;
        int result = multi.apply(6,7);
        System.out.println(result);
    }
}
