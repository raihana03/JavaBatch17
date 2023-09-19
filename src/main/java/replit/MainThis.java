package replit;

public class MainThis {
    String model;
    double price;
    int quantity;

    public MainThis (String model, double price, int quantity){
        this.model= model;
        this.price= price;
        this.quantity= quantity;
    }

    public MainThis(String model, int price) {

    }

    public double carStockValue(){
        return (quantity * price);
    }
    public void printInfo(){
        System.out.println(model+ " "+ "Stock value "+ carStockValue());

    }
    public static void main(String[] args) {
        MainThis sv= new MainThis("Toyota 2019", 250000);
        sv.printInfo();
    }}

