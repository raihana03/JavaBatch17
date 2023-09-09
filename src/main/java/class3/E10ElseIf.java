package class3;

public class E10ElseIf {
    public static void main(String[] args) { //.equals is used when non-primitive (aka string)
        String fruit="Melon";
        if(fruit.equals("Mango")){ //fruit==Mango
            System.out.println("Price is $5");
        }else if(fruit.equals("Orange")){ //fruit==Orange
            System.out.println("Price is $4");
        }else if (fruit.equals("Apple")){
            System.out.println("Price is $2");
        }else if (fruit.equals("Kiwi")){
            System.out.println("$6");
        }else {
            System.out.println("This Fruit is not available right now");
        }
    }
}
