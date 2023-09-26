package class25;

import java.util.LinkedHashSet;

public class E8Sets {
    public static void main(String[] args) {
        //linkedHashSet maintains the order
        LinkedHashSet<Integer> uniqueNumbers= new LinkedHashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(10);
        uniqueNumbers.add(30);
        System.out.println(uniqueNumbers);

    }
}
