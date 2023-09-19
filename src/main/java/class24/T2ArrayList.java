package class24;

import java.util.ArrayList;

public class T2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Audi");
        cars.add("Ford");

        System.out.println(cars);

        System.out.println("**************");
        for (String c:cars){    //enhance for loops
            System.out.println(c);
    }
}}
