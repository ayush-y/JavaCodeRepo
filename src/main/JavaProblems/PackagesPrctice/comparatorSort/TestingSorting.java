package PackagesPrctice.comparatorSort;

import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> emp = List.of(
                new Employee("Ayush", 1000),
                new Employee("Yash", 500),
                new Employee("Yash", 200),
                new Employee("Yash", 400)
        );
        emp.stream()
                .sorted((emp1, emp2) ->  emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
