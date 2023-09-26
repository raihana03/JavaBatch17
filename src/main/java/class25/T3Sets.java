package class25;

import java.util.TreeSet;

public class T3Sets {
    public static void main(String[] args) {
        TreeSet<String> uniqueCountries= new TreeSet<>();
        uniqueCountries.add("Germany");
        uniqueCountries.add("France");
        uniqueCountries.add("Italy");
        uniqueCountries.add("Russia");
        uniqueCountries.add("India");
        uniqueCountries.add("Afghanistan");
        uniqueCountries.add("Pakistan");
        uniqueCountries.add("USA");
        uniqueCountries.add("Mexico");
        uniqueCountries.add("Rwanda");
        System.out.println(uniqueCountries);

        for (String c: uniqueCountries){
            System.out.println(c);
        }

        System.out.println("************");
        uniqueCountries.forEach(x-> System.out.println(x));

    }
}
