import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> g = Arrays.asList("geeks", "for", "geeks");

        Map<String, Long> result = g.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
    }
}
