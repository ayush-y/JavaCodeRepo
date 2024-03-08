import java.util.List;

class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of("Ayush is reading java from KgCoding","Good", "Very Nice",
                "Amazing Content","Love it", "I love to contribute open source project");
        String result = strs.stream()
                .filter(str -> str.length() > 10 )
                .reduce("", (a,b) -> a +" " +b);

        System.out.println(result);
    }
}
