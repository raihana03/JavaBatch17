package class15;

public class CarClass {
    private String make;
    private String model;
    private String color;
    private int price;

    CarClass (String cMake, String cModel, String cColor, int cPrice){
        make= cMake;
        model=cModel;
        color=cColor;
        price=cPrice;
}
void printInfo(){
    System.out.println(make+ " "+ model+ " "+ color+ " "+ price);}
}
