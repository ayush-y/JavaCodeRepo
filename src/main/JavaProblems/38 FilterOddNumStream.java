import java.util.List;

class FilterOddNumStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,17,9,3,4,6,8,110);

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));


    }
}
