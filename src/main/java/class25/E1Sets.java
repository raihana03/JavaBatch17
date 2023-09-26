package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E1Sets {
    public static void main(String[] args) {
        //we can store duplicates in an ArrayList or LinkedList
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);

        //will not allow duplicates
        HashSet<Integer> uniqNumbers= new HashSet<>();
        uniqNumbers.add(10);
        uniqNumbers.add(20);
        uniqNumbers.add(10);
        uniqNumbers.add(10);
        System.out.println(uniqNumbers);
    }
}
