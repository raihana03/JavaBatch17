package review9;

public class ParentSuper {
    String name= "James";

    void printHello(){
        System.out.println("Hello world"); //methods
    }
    ParentSuper(){
        System.out.println("Parent class constructor"); // constructor
    }
    ParentSuper(String n){
        System.out.println("Parent class with parameter"); // constructor
    }
}
class Child extends ParentSuper{
    //String name="John";
    void printHello(){
        System.out.println("Hello Java");
    }
    void test(){
        String name="White";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);

    }
    void methodTest(){
        super.printHello();

    }
    public Child(){ // constructor
        super();

    }}
