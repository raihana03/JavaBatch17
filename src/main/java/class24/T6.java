package class24;

import java.util.ArrayList;

public class T6 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Kiwi");
        System.out.println("Original: "+ fruits);

        fruits.removeIf(d->d.contains("a")||d.endsWith("e"));
        //fruits.removeIf(y->y.endsWith("e"));
        //fruits.removeIf(y->y.contains("a"));
        System.out.println(fruits);
    }
}
