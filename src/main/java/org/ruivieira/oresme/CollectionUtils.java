package org.ruivieira.oresme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionUtils {

    public static <E> List<E> tail(List<E> data, int n) {
        return data.subList(data.size() - n, data.size());
    }

    public static <E> List<E> head(List<E> data, int n) {
        return data.subList(0, n);
    }

    public static String pprint(double[][] data) {
        final StringBuilder result = new StringBuilder();
        int counter = 0;
        for (double[] child : data) {
            result.append("el#").append(counter).append(" = ").append(Arrays.toString(child)).append("\n");
            counter++;
        }
        return result.toString();
    }

    /**
     * Divides a list into sublists of size <code>chunkSize</code>
     * @param data Original {@link List}
     * @param chunkSize The sublist size
     * @return A {@link List} of {@link List}s.
     */
    public static <E> List<List<E>> chunk(List<E> data, int chunkSize) {
        final List<List<E>> result = new ArrayList<>();
        for (int i = 0; i < data.size(); i += chunkSize) {
            int boundary = Math.min(i + chunkSize, data.size());
            result.add(data.subList(i, boundary));
        }
        return result;
    }

}
