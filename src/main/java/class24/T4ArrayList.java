package class24;

import java.util.ArrayList;

public class T4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Milk");
        words.add("Banana");
        words.add("Coffee");
        words.add("Table");
        words.add("TV");

        for (int i = 0; i < words.size(); i++) {
            String drink = words.get(i);


            if (words.get(i).endsWith("e")) {
                System.out.println("Before: "+ words);
                words.remove(i);
                i--;

            }
        }
        System.out.println("After:" +words);
    }}