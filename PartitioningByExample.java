import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningByExample {
    public static void main(String[] args) {
        Stream<Integer>
                s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> numsGreaterThan3 = s.collect(Collectors.partitioningBy(num -> num > 3));
        System.out.println(numsGreaterThan3);

        Stream<Integer>
                s2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, Long>
                map = s2.collect(
                Collectors.partitioningBy(
                        num -> (num > 3), Collectors.counting()));
        System.out.println(map);
    }
}
