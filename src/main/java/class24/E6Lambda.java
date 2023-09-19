package class24;

import java.util.ArrayList;

public class E6Lambda {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Milk");
        words.add("Banana");
        words.add("Coffee");
        words.add("Table");
        words.add("TV");

      /*  for (String x:words){
            System.out.println(x);
        }
        words.forEach(x-> System.out.println(x));
        for (int i= 0; i< words.size(); i++){

            if (words.get(i).contains("e")){
        words.remove(i);
}}*/
    words.removeIf(y->y.contains("e"));
    }}
