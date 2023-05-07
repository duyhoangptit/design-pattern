package java_learn;

import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

public class RandomTask<T> {
    private final NavigableMap<Double, T> map = new TreeMap<>();
    private final Random random;
    private double total = 0;

    public RandomTask() {
        this(new Random());
    }

    public RandomTask(Random random) {
        this.random = random;
    }

    public void add(T value, double totalOfValue) {
        total += totalOfValue;
        map.put(total, value);
    }

    public T next() {
        double value = random.nextDouble() * total;
        return map.higherEntry(value).getValue();
    }

    public NavigableMap<Double, T> getMap() {
        return map;
    }

    public static void main(String[] args) {
        Random random = new Random();
        double value = random.nextDouble();
        System.out.println(value);
    }
}
