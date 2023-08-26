package Class11;

public class E5StringMethods {
    public static void main(String[] args) {
        String str="Batch 17 is GOOD";
        String newStr=(str.toLowerCase().trim().replace("good", "great"));
        System.out.println(newStr);
    }
}
