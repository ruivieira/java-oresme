package org.ruivieira.oresme.linalg;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCoordinateTest {

    @Test
    public void getRow() {
        final MatrixCoordinate c = MatrixCoordinate.create(0, 0);
        Assert.assertEquals(c.getRow(), 0);
    }

    @Test
    public void getCol() {
        final MatrixCoordinate c = MatrixCoordinate.create(1, 1);
        Assert.assertEquals(c.getCol(), 1);
    }
}