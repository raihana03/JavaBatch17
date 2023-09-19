package replit;

public class Parent {
    String city;

    public Parent(String city){
        this.city= city;
    }
    void printInfo(){
        System.out.println(city);
    }

    public static void main(String[] args) {

class Child extends Parent{
    public Child(String city) {
        super("Vienna");

        Child c= new Child("Vienna");
        c.printInfo();
    }
    }
    }

    public void test1() {
    }
}
