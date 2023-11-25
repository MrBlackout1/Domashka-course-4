package Zavd4;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class RandomAlgorithm {
    public Stream<Long> randomAlgorithmWithSeed(long seed, long a, long m, int c) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
