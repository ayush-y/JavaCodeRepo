import java.util.List;
import java.util.stream.Collectors;

class DistinctInStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,1,2,5,3,4,8,9);

        List<Integer> num = numbers.stream()
                            .distinct()
                            .collect(Collectors.toList());
        System.out.println(num);
    }
}
