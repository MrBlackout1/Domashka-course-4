import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zavd1 {

    public static List<String> getOddIndexedStrings(String[] names) {

        return IntStream
                .range(0, names.length)
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> names[i])
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
    String[] names = {"0. Andrew", "1. Ivan","2. John","3. Peter","4. Oleg"};
        System.out.println("Імена з непарними індексами = " + getOddIndexedStrings(names).toString());

    }
}
