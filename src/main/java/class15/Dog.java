package class15;

public class Dog {
   private String name;
    private String breed;
    private String color;
    private int age;

    Dog (String dName, String dBreed, String dColor, int dAge){
        name= dName;
        breed=dBreed;
        color=dColor;
        age=dAge;
        if(dAge<0 || dAge>30){
            System.out.println("not allowed");
        }else {
            age=dAge;
        }

    }
    void bark(){
        System.out.println("woof woof...");
    }
    void printInfo(){
        System.out.println(name+" "+breed+ " "+color);

    }

}
