package org.ruivieira.oresme;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class CollectionUtilsTest {

    @Test
    public void tail() {
        final List<Integer> data = IntStream.range(0, 100).boxed().collect(Collectors.toList());
        assertEquals(data.size(), 100);
        final List<Integer> tailed = CollectionUtils.tail(data, 10);
        assertEquals(tailed.size(), 10);
        assertEquals(tailed.get(0), new Integer(90));
    }

    @Test
    public void head() {
    }

    @Test
    public void pprint() {
    }
}