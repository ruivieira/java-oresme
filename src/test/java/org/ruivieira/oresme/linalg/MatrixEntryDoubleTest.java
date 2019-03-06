package org.ruivieira.oresme.linalg;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class MatrixEntryDoubleTest {

    @Test
    public void getCoordinate() {
        final MatrixEntryDouble e = MatrixEntryDouble.create(0, 0, 10);
        Assert.assertEquals(e.getCoordinate(), MatrixCoordinate.create(0, 0));

    }

    @Test
    public void getValueRaw() {
        final MatrixEntryDouble e = MatrixEntryDouble.create(0, 0, 10);
        Assert.assertTrue(e.getValue().isPresent());
        Assert.assertEquals(e.getValue().get(), 10, 1e-20);
    }

    @Test
    public void getValueOptionPresent() {
        final MatrixEntryDouble e = MatrixEntryDouble.create(0, 0, Optional.of(0d));
        Assert.assertTrue(e.getValue().isPresent());
        Assert.assertEquals(e.getValue().get(), 00, 1e-20);
    }

    @Test
    public void getValueOptionMissing() {
        final MatrixEntryDouble e = MatrixEntryDouble.create(0, 0, Optional.empty());
        Assert.assertTrue(!e.getValue().isPresent());
    }

    @Test
    public void getValueEmpty() {
        final MatrixEntryDouble e = MatrixEntryDouble.create(0, 0);
        Assert.assertTrue(!e.getValue().isPresent());
    }


}