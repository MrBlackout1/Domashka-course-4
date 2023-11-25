import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Zavd5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> combinedList = Stream
                .concat(first, second)
                .collect(Collectors.toList());
        Collections.shuffle(combinedList);
        return combinedList.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 3, 5, 7, 9);
        Stream<Integer> stream2 = Stream.of(2, 4, 6, 8, 10);

        Stream<Integer> shuffledStream = zip(stream1, stream2);
        shuffledStream.forEach(System.out::println);

    }
}
