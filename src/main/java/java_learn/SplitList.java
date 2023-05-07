package java_learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitList {

    public static <T> List<List<T>> chopped(List<T> list, final int L) {
        List<List<T>> parts = new ArrayList<>();
        final int N = list.size();
        for (int i = 0; i < N; i += L) {
            parts.add(list.subList(i, Math.min(N, i + L)));
        }
        return parts;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(
                Arrays.asList(5, 3, 1, 2, 9, 5, 0, 7)
        );

        System.out.println(chopped(numbers, 3));
    }
}
