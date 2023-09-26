package class25;

import java.util.LinkedHashSet;

public class T4Sets {
    public static void main(String[] args) {
        LinkedHashSet<String> cities= new LinkedHashSet<>();
        cities.add("New York City");
        cities.add("Los Angeles");
        cities.add("San Diego");
        cities.add("Houston");
        cities.add("Las Vegas");
        cities.add("Alexandria");
        System.out.println(cities);

        cities.removeIf(x-> x.startsWith("A"));
        System.out.println(cities);


    }
}
