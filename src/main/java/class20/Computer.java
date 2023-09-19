package class20;

public class Computer {
void browser(){
    System.out.println("Opens browser");
}
void virus(){
    System.out.println("Virus detected");
}
void shutOff(){
    System.out.println("Computer shuts off");
}
}
class Apple extends Computer{

    @Override
    void browser() {
        System.out.println("Safari");
    }
}
class Lenovo extends Computer{

    @Override
    void browser() {
        System.out.println("Edge");
    }
}
class HP extends Computer{

    @Override
    void browser() {
        System.out.println("Chrome");
    }
}
class Dell extends Computer{

    @Override
    void browser() {
        System.out.println("Firefox");
    }
}


