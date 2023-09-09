package class16;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private double weight;
    private char gender;
    private String color;
    public void printInfo(){
        System.out.println(name+" "+breed+" "+ age+ " "+weight+ " "+ gender+ " "+ color);
    }
    public Cat (){

    }
    public Cat (String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    public Cat (String name, String breed, int age, double weight, char gender, String color){
        this(name, breed, age, weight);
        this.gender= gender;
        this.color= color;

    }
}
