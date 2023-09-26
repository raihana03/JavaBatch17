package class26;

import java.util.Collection;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup= new TreeMap<>();
        makeup.put("lipstick", 22.0);
        makeup.put("blush", 40.0);
        makeup.put("base", 50.5);
        makeup.put("foundation", 90.5);
        makeup.put("eyeliner", 25.5);
        makeup.put("concealer", 35.6);
        makeup.put("eyeliner", 25.5);
        System.out.println(makeup);
        Collection<String> onlyKeys=makeup.keySet();
        Collection<Double> onlyValue= makeup.values();
        System.out.println(onlyKeys);
        System.out.println(onlyValue);
    }
}
