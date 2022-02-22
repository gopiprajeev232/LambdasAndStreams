import java.util.*;

public class ShortCircuitOperations {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("RAM");
        names.add("Ravi");
        names.add("Rham");
        names.add("Rhiv");
        names.add("Raman");

        Optional<String> firstItem = names.stream().findFirst();
        if(firstItem.isPresent())
            System.out.println(firstItem.get());
        else
            System.out.println("Empty stream");

        Optional<String>  anyNameStartingWithS = names.stream().filter(n -> n.startsWith("S")).findAny();

        if(anyNameStartingWithS.isPresent())
            System.out.println(anyNameStartingWithS.get());
        else
            System.out.println("Empty stream");

        boolean isMatchedShiv = names.stream().anyMatch(a -> a.startsWith("Shiv"));
        System.out.println("Matches with Shiv? "+isMatchedShiv);

        boolean isMatchedAll = names.stream().anyMatch(a -> a.startsWith("R"));
        System.out.println("Matches with Shiv? "+isMatchedAll);

        List<Integer> numbers = Arrays.asList(13, 82, 43, 41);

        boolean isNoneMatched = numbers.stream().noneMatch((a) -> (a < 10));
        System.out.println("None of the number less than 5 = "+isNoneMatched);

        boolean isNoneMatched2 = numbers.stream().noneMatch((a) -> (a > 25));
        System.out.println("None of the number greater than 25 = "+isNoneMatched2);
    }
}
