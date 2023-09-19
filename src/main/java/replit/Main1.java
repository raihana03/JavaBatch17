package replit;

public class Main1 {
    String city;

    public void c1(){
        System.out.println("Vienna");
    }
    }

class Child extends Main{
    public Child(String city) {
        super(city);
    }
    void printInfo(){
        System.out.println("Vienna");}

    public static void main(String[] args) {
        Child c= new Child("Vienna");
        c.printInfo();

    }

}




