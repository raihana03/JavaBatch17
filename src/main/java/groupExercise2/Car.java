package groupExercise2;

/*
Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a price of the car.

Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
and has its own implementation of calculateSalePrice() method in which returned price
is calculated as following: if weight>2000 then returned price car should include 10%
discount, otherwise 20% discount.

The Sedan class has field as length and also does it is own implementation of
calculateSalePrice(): if length of sedan is >20 feet then returned car price should
include 5% discount, otherwise 10% discount
 */
public class Car {

    private double regularPrice;
    private String color;

    public Car(double regularPrice, String color) {
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}
class Sedan extends Car {
    private int weight;

    public Sedan(double regularPrice, String color, int weight) {
        super(regularPrice, color);
        this.weight = weight;
    }
    public double getSalePrice() {
        return super.getSalePrice() * (weight > 2000 ? 0.90 : 0.80);
    }
}
class Truck extends Car {

    private int length;

    public Truck(double regularPrice, String color, int length) {
        super(regularPrice, color);
        this.length = length;
    }
    public double getSalePrice() {
        return super.getSalePrice() * (length < 20 ? 0.95 : 0.90);
    }
}
class CarTest{
    public static void main(String[] args) {
        Truck truck = new Truck(50000, "red", 30);
        Sedan sedan = new Sedan(30000, "black", 300);
        System.out.println("The price of the truck: " + truck.getSalePrice());
        System.out.println ("The price of the sedan: " + sedan.getSalePrice());

    }}