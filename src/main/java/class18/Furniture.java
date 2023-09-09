package class18;

public class Furniture extends GrandParent {
    String color="black";

}
class Chair extends Furniture{
    String color="brown";
    void printColor(){
        String color="Blue";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}

//local>instance>main