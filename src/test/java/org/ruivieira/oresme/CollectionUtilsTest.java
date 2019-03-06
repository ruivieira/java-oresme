package org.ruivieira.oresme;

import org.junit.Assert;
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

    @Test
    public void chunk() {
        final List<Integer> samples = Samples.randomIntUnique(101, 101);
        final List<List<Integer>> chunks = CollectionUtils.chunk(samples, 5);
        Assert.assertEquals(chunks.size(), 21);
        Assert.assertEquals(chunks.get(0).size(), 5);
        Assert.assertEquals(CollectionUtils.tail(chunks, 1).size(), 1);
    }
}