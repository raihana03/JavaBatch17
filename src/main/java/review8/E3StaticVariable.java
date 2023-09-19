package review8;

public class E3StaticVariable {
    public static String country= "USA";

    void printName(){
        System.out.println(country);
    }
    static void printCountry(){
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(country);
    }
}
class StaticTester{

    public static void main(String[] args) {
        System.out.println(E3StaticVariable.country);
    }
}
