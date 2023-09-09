package class10;

public class CarTester {
    public static void main(String[] args) {
        Car bmwObj= new Car();
        bmwObj.make= "BMW";
        bmwObj.model= "325";
        bmwObj.color= "Black";
        bmwObj.price= 75000;
        System.out.println(bmwObj.make);
        System.out.println(bmwObj.model);
        System.out.println(bmwObj.color);
        System.out.println(bmwObj.price);
        bmwObj.drive();
        bmwObj.stop();

        Car audiObj= new Car();
        audiObj.make= "Audi";
        audiObj.model= "325";
        audiObj.color= "white";
        audiObj.price= 90000;
        System.out.println(audiObj.make);
        System.out.println(audiObj.model);
        System.out.println(audiObj.color);
        System.out.println(audiObj.price);


    }
}
