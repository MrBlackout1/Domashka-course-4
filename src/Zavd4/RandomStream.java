package Zavd4;

import java.util.List;
import java.util.stream.Stream;

public class RandomStream {

    public static void main(String[] args) {
        RandomAlgorithm ra = new RandomAlgorithm();
        Stream<Long> iterate = ra.randomAlgorithmWithSeed(10,25214903917L,(long)Math.pow(2, 48),11);

        List<Long> randList = iterate
                .peek(System.out::println)
                .limit(10)
                .toList();

    }
}
