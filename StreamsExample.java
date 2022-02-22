import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    int id, age;
    String name;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}

public class StreamsExample {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Gopi", 21));
        employees.add(new Employee(2, "Prajeev", 45));
        employees.add(new Employee(3, "Rakesh", 33));
        employees.add(new Employee(4, "Ramesh", 46));
        employees.add(new Employee(5, "Harish", 29));

        Stream<Employee> employeesOver30 = employees.stream().filter(e -> e.age > 30);
        employeesOver30.forEach(data -> System.out.println(data.name + " " + data.age));
    }
}
