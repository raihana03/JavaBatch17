package class16;
/*
Write a java class that have 4 constructors with 4 different access levels
of constructors(private,public,default,protected) and create 4 objects of
this class: 1 - inside same class; 2 - from outside the class; 3 - from
different class inside different package  and observe result.

 */
public class Contester {
    private Contester(){
        System.out.println("Private");
    }
    Contester(String name){
        System.out.println("Default");
    }
    protected Contester (int age){
        System.out.println("Protected");
    }
    public Contester(double weight){
        System.out.println("Public");
    }

    public static void main(String[] args) {
        new Contester();
        new Contester("sjfie");
        new Contester(12);
        new Contester(12.44);
    }
}
