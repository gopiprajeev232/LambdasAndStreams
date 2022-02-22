import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String... args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Gopi", 21));
        employees.add(new Employee(2, "Prajeev", 45));
        employees.add(new Employee(3, "Rakesh", 33));
        employees.add(new Employee(4, "Ramesh", 46));
        employees.add(new Employee(5, "Harish", 29));

        List<String> empUnder30 = employees.stream().filter(e -> e.age < 30).map(e -> e.name).collect(Collectors.toList());
        System.out.println(empUnder30);
    }
}
