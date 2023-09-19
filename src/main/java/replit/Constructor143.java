package replit;

public class Constructor143 {
    String make;
    String model;
    int numberOfDoors;
    double topSpeed;
    double price;
    public Constructor143(String make, String model,  double topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
        System.out.println(make + " " + model + " " + topSpeed + " " + price);
    }
    public Constructor143(int numberOfDoors, double topSpeed, double price){
        this.numberOfDoors= numberOfDoors;
        this.topSpeed= topSpeed;
        this.price= price;
        System.out.println(numberOfDoors+ " "+ topSpeed+ " "+ price);
    }
public Constructor143(String make, String model, int numberOfDoors, double topSpeed, double price){
    this.make= make;
    this.model= model;
    this.numberOfDoors= numberOfDoors;
    this.topSpeed= topSpeed;
    this.price= price;
    System.out.println(make+" "+ model+" "+ numberOfDoors+ " "+ topSpeed+ " "+ price);
}
    public Constructor143(String make, String model, int numberOfDoors){
        this.make= make;
        this.model= model;
        this.numberOfDoors= numberOfDoors;
        System.out.println(make+" "+ model+" "+ numberOfDoors);

}
    public static void main(String[] args) {
 Constructor143 c= new Constructor143("Toyota", "Prius", 4, 120, 30000.0);
        Constructor143 d= new Constructor143("Toyota", "Prius", 4, 120, 30000.0);
        Constructor143 e= new Constructor143("unknown", "unknown", 4, 120, 30000.0);
        Constructor143 f= new Constructor143("Toyota", "Prius", 4, 90, 0.0);
    }}
