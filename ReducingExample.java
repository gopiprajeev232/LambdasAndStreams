import java.util.Arrays;
import java.util.Optional;

public class ReducingExample {
    public static void main(String[] args) {
        String[] array = { "Testing", "the", "reductions" };

        Optional<String> combine = Arrays.stream(array).reduce((str1, str2) -> str1+" "+str2);
        System.out.println(combine.get());
    }
}
