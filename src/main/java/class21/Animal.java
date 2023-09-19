package class21;

public abstract class Animal {
String name;
String breed;
String color;
    abstract void speak(); //methods
   abstract void sleep();
   abstract void eat();
   public void printInfo(){
       System.out.println(name+ " "+ breed+ " "+ color);
   }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Woof woof...");
    }
    @Override
    void sleep() {
        System.out.println("Sleeps for 10 hours...");
    }
    @Override
    void eat() {
        System.out.println("Eats bones...");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meowww meow...");
    }
    @Override
    void sleep() {
        System.out.println("Sleeps 15 hours...");
    }
    @Override
    void eat() {
        System.out.println("Eats fish...");

    }
}