package class25;

import java.util.HashSet;
import java.util.TreeSet;

public class E9Sets {
    public static void main(String[] args) {
        TreeSet<Integer> numbers= new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(5);
        numbers.add(10);
        System.out.println(numbers);
        HashSet<Integer> set= new HashSet<>(numbers);
        System.out.println(set);
        numbers.clear();
        System.out.println(numbers);
        numbers.addAll(set);
        System.out.println(numbers); //task 1?
    }
}
