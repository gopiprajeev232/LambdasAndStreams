import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctLimitAndSkipExample {
    public static void main(String... args) {
        System.out.println("Example of skip: ");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i%2 == 0)
                .skip(2)
                .forEach(i -> System.out.print(i + " "));

        System.out.println("\nExample of limit: ");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i%2 == 0)
                .limit(2)
                .forEach(i -> System.out.print(i + " "));

        System.out.println("\nExample of distinct: ");
        Stream.of("A", "B", "C", "D", "A", "B", "C")
                .distinct()
                .forEach(i -> System.out.print(i + " "));
    }
}
