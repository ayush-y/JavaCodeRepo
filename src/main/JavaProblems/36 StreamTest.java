import java.util.ArrayList;
import java.util.List;

class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Ayush", "Ram", "Shyam");
        names.stream()
                .forEach(name -> System.out.println(name));

    }
}
