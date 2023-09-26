package review10;

public abstract class Animal {
    abstract void speak();
    abstract void eat();
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("woof woof");
    }
    @Override
    void eat() {
        System.out.println("Dogs like to eat bones");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow meow");
    }
    @Override
    void eat() {
        System.out.println("cats like to eat free fish from Guila");
    }
}