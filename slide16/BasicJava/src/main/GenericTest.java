package main;

import java.util.List;

public class GenericTest<T> {
	private T value;

    public void set(T value) { this.value = value; }
    public T get() { return value; }

    @Override
    public String toString() {
        return "Box containing: " + value;
    }
    
    public static <T> void printTwice(T input) {
        System.out.println(input);
        System.out.println(input);
    }

    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }
    
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

}
