package class24;

import java.util.ArrayList;
/*
Create an arrayList of drinks call it. If any drink has letter “a”
or “e” replace the whole word with water.
 */
public class T3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Pepsi");
        drinks.add("Fanta");
        drinks.add("Ginger Ale");
        drinks.add("7UP");

       for (int i=0; i< drinks.size(); i++){
           String drink= drinks.get(i);

           if (drinks.get(i).contains("a") || drinks.get(i).contains("e")){
               drinks.set(i,"water");
           }
       }
        System.out.println(drinks);
    }
}
