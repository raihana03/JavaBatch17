package class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class T2Sets {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        System.out.println(aList);


        LinkedHashSet<String>a=new LinkedHashSet<>(aList);
        System.out.println(a);

        aList.clear();
        aList.addAll(a);
        System.out.println(aList);


    }
}
