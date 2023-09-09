package class18;

public class Car {
   private String make;
    private String model;
    private double price;
    private String color;
    public Car(String make, String model, double price, String color){ // constructor
    this.make= make;
    this.model= model;
    this.price=price;
    this.color=color;
    }
    public Car(String make, String model, double price){ // constructor
        this.make= make;
        this.model= model;
        this.price=price;}
    void printInfo(){ //method
        System.out.println(make+" "+ model+ " "+ price+ " "+ color);
    }
}
class BMW extends Car {
    public BMW(String make, String model, double price, String color) {
        //calling the constructor from the parent class
        super(make, model, price, color); //super needed to call constructor from parent
    }
}
class Audi extends Car{
public Audi(String make, String model, double price, String color){
        super(make, model, price, color);
        }}
