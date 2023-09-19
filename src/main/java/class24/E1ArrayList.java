package class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

    ArrayList<String> names= new ArrayList<>();
    names.add("Deppali");
    names.add("Ahmed");
    names.add("Raihana");
    names.add("Ayesha");
    names.add("Ehab");
    names.remove("Deppali");
        System.out.println(names);

        names.add(2, "Ali");
        System.out.println(names);
        names.set(1, "Jamel");
        System.out.println(names);
}}

