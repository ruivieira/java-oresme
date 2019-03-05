package org.ruivieira.oresme;

import java.util.Arrays;
import java.util.List;

public class CollectionUtils {

    public static <E> List<E> tail(List<E> data, int n) {
        return data.subList(data.size() - n - 1, n - 1);
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

}
