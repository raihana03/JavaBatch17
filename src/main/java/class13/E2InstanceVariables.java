package class13;

public class E2InstanceVariables {
    String name= "Hind";
    void printAge(){
        int age=23;
        System.out.println(age);
        System.out.println(name);
        System.out.println(country);
    }
    void printCountry(){
        System.out.println(name);
        System.out.println(country);

    }
    static String country="Uganda";
}
