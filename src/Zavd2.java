import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zavd2 {
    public static List<String> getSortedNames(String[] names) {
        return
                Arrays.stream(names)
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
    String[] names = {"Ivan", "Peter", "Oleg", "Andrew"};

        System.out.println("Відсортовані імена = " + getSortedNames(names).toString());
    }
}
