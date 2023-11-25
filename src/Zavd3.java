import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zavd3 {

    public static List<Integer> getSortedNumbers(String[] arr) {

        return Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt).sorted(Integer::compareTo).collect(Collectors.toList());
    }

    public static void main(String[] args) {
    String[] arr = {"1, 2, 0", "4, 5"};

        System.out.println("Відсортовані числа: " + getSortedNumbers(arr));

    }
}
