package class10;

public class PhoneTester {
    public static void main(String[] args) {

    Phone raiObj= new Phone();
    raiObj.make= "Apple";
    raiObj.model= "Iphone 14";
    raiObj.storage= 256;
    raiObj.price= 1000;;
        System.out.println(raiObj.make);
        System.out.println(raiObj.model);
        System.out.println(raiObj.storage);
        System.out.println(raiObj.price);

        Phone pixelObj= new Phone();
        pixelObj.make= "Google";
        pixelObj.model= "Pixel";
        pixelObj.storage= 200;
        pixelObj.price= 1200;;
        System.out.println(pixelObj.make);
        System.out.println(pixelObj.model);
        System.out.println(pixelObj.storage);
        System.out.println(pixelObj.price);

        Phone samsungObj= new Phone();
        samsungObj.make= "Samsung";
        samsungObj.model= "S23 Ultra";
        samsungObj.storage= 150;
        samsungObj.price= 1500;;
        System.out.println(samsungObj.make);
        System.out.println(samsungObj.model);
        System.out.println(samsungObj.storage);
        System.out.println(samsungObj.price);
}}
