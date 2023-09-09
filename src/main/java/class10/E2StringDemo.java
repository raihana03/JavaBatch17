package class10;

public class E2StringDemo {
    public static void main(String[] args) {
        String name= "Madina";
        System.out.println(name.toLowerCase());
        name=name.toLowerCase();
        System.out.println(name);
        if (name.length()<8){
            System.out.println("Name not allowed");
        }
        System.out.println(name.length());

    }
}
