package org.ruivieira.oresme.linalg;

import java.util.Optional;

public class MatrixEntryDouble {

    public MatrixCoordinate getCoordinate() {
        return coordinate;
    }

    public Optional<Double> getValue() {
        return value;
    }

    private final MatrixCoordinate coordinate;
    private final Optional<Double> value;

    private MatrixEntryDouble(MatrixCoordinate coordinate, Optional<Double> value) {
        this.coordinate = coordinate;
        this.value = value;
    }

    public static MatrixEntryDouble create(int row, int col, Optional<Double> value) {
        return new MatrixEntryDouble(MatrixCoordinate.create(row, col), value);
    }

    public static MatrixEntryDouble create(int row, int col) {
        return new MatrixEntryDouble(MatrixCoordinate.create(row, col), Optional.empty());
    }

    public static MatrixEntryDouble create(int row, int col, double value) {
        return new MatrixEntryDouble(MatrixCoordinate.create(row, col), Optional.of(value));
    }

}
