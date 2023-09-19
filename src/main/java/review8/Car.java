package review8;

public class Car {
    String make;
    String model;
     public Car(String make, String model){
         this.make=make;
         this.model=model;
     }
     public Car(String make){
         this();
        this.make=make;
     }
     public Car(){
         System.out.println(1);
         System.out.println(2);
         System.out.println(3);
     }

    public static void main(String[] args) {
        new Car("Toyota");
    }
}
