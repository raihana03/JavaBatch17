package class24;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Deppali");
        names.add("Ahmed");
        names.add("Raihana");
        names.add("Ayesha");
        names.add("Ehab");
        for (int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println("**************");
        for (String n:names){    //enhance for loops
            System.out.println(n);
        }
        System.out.println("**************");
        int i= 0;
        while (i<names.size()){
        System.out.println(names.get(i));
        i++;
    }
}}
