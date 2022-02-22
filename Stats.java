import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stats {
    public static void main(String[] args) {
        IntStream streamOfNumbers = IntStream.range(1, 100);
        streamOfNumbers.forEach(System.out::println);

        streamOfNumbers = IntStream.range(1, 100);
        OptionalInt max = streamOfNumbers.max();
        System.out.println("Max: "+max.getAsInt());

        streamOfNumbers = IntStream.range(1, 100);
        OptionalInt min = streamOfNumbers.min();
        System.out.println(min.getAsInt());

        streamOfNumbers = IntStream.range(1, 100);
        OptionalDouble average = streamOfNumbers.average();
        System.out.println(average);
    }
}
