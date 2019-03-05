package org.ruivieira.oresme;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PairTest {

    private final Pair<Integer, Integer> pair = Pair.create(1, 2);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getA() {
        Assert.assertEquals(pair.getA(), new Integer(1));
    }

    @Test
    public void getB() {
        Assert.assertEquals(pair.getB(), new Integer(2));
    }


    @Test
    public void equals() {
        Pair<Integer, Integer> pair2 = Pair.create(1, 2);
        Assert.assertEquals(pair, pair2);
    }

    @Test
    public void pairHashCode() {
        Pair<Integer, Integer> pair2 = Pair.create(1, 2);
        Assert.assertTrue(pair.hashCode() == pair2.hashCode());
    }
}