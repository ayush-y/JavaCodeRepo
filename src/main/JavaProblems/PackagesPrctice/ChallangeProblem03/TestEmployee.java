package PackagesPrctice.ChallangeProblem03;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Ayush", 25, 30000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Tinku");
        System.out.println(emp.getEmployeeDetails());
    }
}
