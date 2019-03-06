package org.ruivieira.oresme.linalg;

import java.util.Objects;

public class MatrixCoordinate {

    private final int row;
    private final int col;

    private MatrixCoordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public static MatrixCoordinate create(int row, int col) {
        return new MatrixCoordinate(row, col);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatrixCoordinate that = (MatrixCoordinate) o;
        return row == that.row &&
                col == that.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}
