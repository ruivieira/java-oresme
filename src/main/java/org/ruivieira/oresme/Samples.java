package org.ruivieira.oresme;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Samples {

    public static List<Integer> randomIntUnique(int size, int samples) {
        final List<Integer> indices = IntStream.range(0, size).boxed().collect(Collectors.toList());
        Collections.shuffle(indices);
        return CollectionUtils.head(indices, samples);
    }

}
